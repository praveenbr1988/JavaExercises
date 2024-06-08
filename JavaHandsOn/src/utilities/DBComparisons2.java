package utilities;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DBComparisons2 {


	public static ThreadLocal <List<LinkedHashMap<String,Object>>> uilstData = new ThreadLocal <List<LinkedHashMap<String,Object>>>();
	public static ThreadLocal <List<Map<String,Object>>> dblstData = new ThreadLocal <List<Map<String,Object>>>();
	private String report = "";
	private static List<String> keystore = new ArrayList<String>();
	
	

	public static void main(String[] args) throws IOException {		
		
		List<LinkedHashMap<String, Object>> oListUIData = new ArrayList<LinkedHashMap<String, Object>>();		
		for(int i=1;i<=4;i++) {		
			LinkedHashMap<String, Object> oResultUIData = new LinkedHashMap<String, Object>();
			switch(i) {			
			case 1:
				oResultUIData.put("SNO", "1");
				oResultUIData.put("ID", "262075");
				oResultUIData.put("NAME", "Praveen");
				oResultUIData.put("RESULT", "PASS");
				break;				
			case 2:
				oResultUIData.put("SNO", "2");
				oResultUIData.put("ID", "262076");
				oResultUIData.put("NAME", "SOWMIYA");
				oResultUIData.put("RESULT", "PASS");
				break;				
			case 3:
				oResultUIData.put("SNO", "3");
				oResultUIData.put("ID", "262077");
				oResultUIData.put("NAME", "VIDYUTH");
				oResultUIData.put("RESULT", "PASS");
				break;				
			case 4:
				oResultUIData.put("SNO", "4");
				oResultUIData.put("ID", "262078");
				oResultUIData.put("NAME", "DHANYA");
				oResultUIData.put("RESULT", "PASS");
				break;		
			}
			oListUIData.add(oResultUIData);						
		}	

		uilstData.set(oListUIData);
		System.out.println("UI Data: "+uilstData.get());
		

		
		List<Map<String, Object>> oListDBData = new ArrayList<Map<String, Object>>();		
		for(int i=1;i<=4;i++) {		
			LinkedHashMap<String, Object> oResultDBData = new LinkedHashMap<String, Object>();
			switch(i) {			
			case 1:
				oResultDBData.put("SNO", "1");
				oResultDBData.put("ID", "262075");
				oResultDBData.put("NAME", "Praveen");
				oResultDBData.put("RESULT", "PASS");
				break;				
			case 2:
				oResultDBData.put("SNO", "2");
				oResultDBData.put("ID", "262076");
				oResultDBData.put("NAME", "SOWMIYA");
				oResultDBData.put("RESULT", "PASS");
				break;				
			case 3:
				oResultDBData.put("SNO", "3");
				oResultDBData.put("ID", "262077");
				oResultDBData.put("NAME", "VIDYUTH");
				oResultDBData.put("RESULT", "PASS");
				break;				
			case 4:
				oResultDBData.put("SNO", "4");
				oResultDBData.put("ID", "262078");
				oResultDBData.put("NAME", "DHANYA");
				oResultDBData.put("RESULT", "PASS");
				break;		
			}
			oListDBData.add(oResultDBData);		
		}		

		dblstData.set(oListDBData);
		System.out.println("DB Data: "+dblstData.get());
		
		
		comparisonBetweenUIVsDB();
	}
	
	private static boolean comparisonBetweenUIVsDB() throws IOException {		
		List<Map<String,Object>> finalListFromDB = dblstData.get();			
		List<LinkedHashMap<String,Object>> finalListFromUI = uilstData.get();
		
		String report = dbvsUIRecords(finalListFromDB,finalListFromUI, "SNO");
		FileWriter file = new FileWriter("src\\report.html", false);
		file.write(report);
		file.close();
		
		if (report.contains("fail")) { 		
			System.out.println("Records dont match");
			return false;
		}		
		else{
			System.out.println("Records match");
			return true;
		}	
		
	}

	private static String dbvsUIRecords(List<Map<String, Object>> dbResults, List<LinkedHashMap<String, Object>> uiresults, String sPrimaryKey) {
		
		List<LinkedHashMap<String,Object>> uirecords = uiresults;
		if(dbResults.size()!=0) {
			for(Map<String,Object> oMap: dbResults ) {
				int iUIIndex = getUIIndex(sPrimaryKey,oMap.get(sPrimaryKey),uiresults);
				if(iUIIndex!=-1) {
					
					appendReport(CommonMethods.getTableStartTag(sPrimaryKey.toUpperCase() + ": " + oMap.get(sPrimaryKey).toString())+CommonMethods.getHeaderWithColumns(new String[] { "Field Name", "Database value", "UI value","Result"}),true);
					String sTable = CommonMethods.getTableStartTag("DB Vs UI Validation") + CommonMethods.getHeaderWithColumns(new String[] {"Field name" , "DB Value", "Ui Value", "Result"});
					setUIMatch(iUIIndex);
					int iFieldsFailed = 0;
					for(String sKey: oMap.keySet()) {
						
						Object oDBValue = oMap.get(sKey);
						Object oUIValue = null;
						
						if(sKey.equals(sPrimaryKey)) {
							oUIValue = getUIValue(sKey, uiresults.get(iUIIndex),true);
							keystore.add(oUIValue.toString());
						}else {
							oUIValue = getUIValue(sKey, uiresults.get(iUIIndex),false);
						}
						
						String sResult = validateResult(sKey,oDBValue, oUIValue);
						
						if(sResult.equals("Fail")) {
							iFieldsFailed++;
						}
						
						appendReport(sResult, true);
						sTable = sTable +CommonMethods.getRowWithColumns(new String[] {sKey, (String) oDBValue, (String) oUIValue, CommonMethods.getStatusWithColor(sResult)});
						
						}
						
					System.out.println(sTable + CommonMethods.getTableEndTag());
						
						if(iFieldsFailed>0) {
							System.out.println("Comparison failed "+iFieldsFailed+" Fields are with errors");
						}
						appendReport(CommonMethods.getTableEndTag(),true);
						
					} else {
						
						appendReport(CommonMethods.getTableStartTag(sPrimaryKey+ ": "+ oMap.get(sPrimaryKey).toString()) + CommonMethods.getRowWithColumns(new String[] {CommonMethods.getStatusWithColor("Fail"),"Record does not have matched record in DB Results"}),true);
						
				}
				
			}
			
			setUIExtraRecords();
			
		} else {
			appendReport(CommonMethods.getTableStartTag("DB Vs UI")+ CommonMethods.getRowWithColumns(new String[] {CommonMethods.getStatusWithColor("Warning"),"DB Values are empty"})+ CommonMethods.getTableEndTag(), true);
		}
		
		
		return "";
	}

	private static int getUIIndex(String sPrimaryKey, String sKeyValue, List<LinkedHashMap<String, Object>> uiresults) {
		
		int iUIIndex= -1;
		for(int iIndex=0; iIndex<uiresults.size(); iIndex++) {
			Object uivalue= null;
			
			if(sPrimaryKey.contains(".")) {
				uivalue = getNestedValue(sPrimaryKey, uiresults.get(iIndex));
			}else {
				uivalue = getUIValue(sPrimaryKey, uiresults.get(iIndex), true);
			}
			
			if(uivalue!=null) {
				
				if(uivalue.toString().equals(sKeyValue)) {
					return iIndex;
				}
			}
			
		}
		
		return iUIIndex;
	}

	private static Object getUIValue(String sTag, LinkedHashMap<String, Object> uiresults, boolean bPrimaryKey) {

		LinkedHashMap<String, Boolean> pathtags = getPathTags(sTag, bPrimaryKey);
		Object tagvalue=null;
		
		LinkedHashMap<String, Object> parenttag = uiresults;
		List<LinkedHashMap<String, Object>> listparenttag = null;
		String sParentTag = "";
		
		for(String sPathTag: pathtags.keySet()) {
			
			String sIndexBaseTag = "";
			int iTagIndex = 0;
			List<String> components = getRegExpMatchGroup("(.*)\\[(\\d+)\\]", sPathTag);
			
			if(components!=null) {
				sIndexBaseTag = components.get(1);
				iTagIndex = Integer.parseInt(components.get(2));
			}
			
			if(pathtags.get(sPathTag)) {
				
				if(parenttag!=null) {
					
					if(iTagIndex!=0) {
						tagvalue= getNestedValue(sIndexBaseTag, parenttag,iTagIndex);
					}else {
						tagvalue= getNestedValue(sPathTag,parenttag);
					}
					
				} else if(listparenttag !=null) {
					
					if(iTagIndex!=0) {
						tagvalue = getNestedValue(sIndexBaseTag, listparenttag,iTagIndex);
					}
					else {
						tagvalue= getNestedValue(sPathTag,listparenttag);
					}
				}
			}else {
				
				if((iTagIndex!=0) && listparenttag ==null) {
					return null;
				}				
				if(parenttag!=null) {
					tagvalue=getNonNestedValue(sPathTag, parenttag);
				} else if(listparenttag!=null) {					
					if((iTagIndex>=0) && sParentTag.toUpperCase().contains("BORROWERS")) {
						tagvalue = getNonNestedValueOfBorrower(sIndexBaseTag,listparenttag,iTagIndex);
					} else if (iTagIndex!=0) {
						tagvalue = getNonNestedValue(sIndexBaseTag,listparenttag,iTagIndex);
					} else {
						tagvalue = getNonNestedValue(sPathTag,listparenttag);
					}
					
				}
				
			}
			
			if(tagvalue==null) {
				return null;
			}else {				
				try {
					parenttag = (LinkedHashMap<String, Object>) tagvalue;
				} catch(Exception e) {
					parenttag=null;
				}
				
				try {
					listparenttag = (List<LinkedHashMap<String, Object>>) tagvalue;
				} catch(Exception e) {
					listparenttag=null;
				}
			}
			sParentTag=sPathTag;	
		}
	
		return tagvalue;
	}
	

	private static Object getNestedValue(String sTag, LinkedHashMap<String, Object> parenttag) {
		Object uivalue=null;
		if(parenttag==null)
			return null;
		
		for(String sKey:parenttag.keySet()) {
			
			if(sKey.equalsIgnoreCase(sTag)) {
				return parenttag.get(sKey);
			}else {
				
				try {
					List<LinkedHashMap<String,Object>> oList = (List<LinkedHashMap<String, Object>>) parenttag.get(sKey);
					uivalue = getNestedValue(sTag,oList);
				} catch(Exception e) {
					
				}
				
				try {
					LinkedHashMap<String,Object> oMap = (LinkedHashMap<String, Object>) parenttag.get(sKey);
					uivalue = getNestedValue(sTag,oMap);
				} catch(Exception e) {
					
				}
				
				if(uivalue!=null) {
					return uivalue;
				}
				
				
			}
		}
		
		return uivalue;
	}

	private static Object getNestedValue(String sTag, List<LinkedHashMap<String, Object>> parenttag) {

		for(LinkedHashMap<String, Object> oMap: parenttag) {
			
			Object uivalue = getNestedValue(sTag, oMap);
			if(uivalue!=null) {
				return uivalue;
			}
		}
		
		return null;
	}
	
	


	
	


}



