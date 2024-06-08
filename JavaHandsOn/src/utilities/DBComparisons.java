package utilities;

import java.util.LinkedHashMap;
import java.util.Set;

public class DBComparisons {


	public static ThreadLocal<LinkedHashMap<String,String>> uiData = new ThreadLocal<LinkedHashMap<String,String>>();
	public static ThreadLocal<LinkedHashMap<String,String>> dbData = new ThreadLocal<LinkedHashMap<String,String>>();
	

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> oResultUIData = new LinkedHashMap<String, String>();
		oResultUIData.put("1", "Praveen");
		oResultUIData.put("2", "Sowmiya");
		oResultUIData.put("3", "Vidyuth");
		oResultUIData.put("4", "Virskhya");
		uiData.set(oResultUIData);
		
		
		LinkedHashMap<String, String> oResultDBData = new LinkedHashMap<String, String>();
		
		oResultDBData.put("1", "Praveens");
		oResultDBData.put("2", "Sowmiya");
		oResultDBData.put("3", "Vidyuth");
		oResultDBData.put("4", "Virskhya");
		dbData.set(oResultDBData);	
		
		validationBetweenUIAndDB();
		

	}
	
	
	public static void validationBetweenUIAndDB() {
		
		
		LinkedHashMap<String, String> oResultUIData = uiData.get();
		LinkedHashMap<String, String> oResultDBData = dbData.get();
		
		System.out.println("UI Data: " +oResultUIData);
		System.out.println("DB Data: " +oResultDBData);
		
		int iFieldsFailed = 0;
		Set<String> oKeys = oResultUIData.keySet();
		String sResult, sDBValue, sUIValue;
		
		for(String sKey : oKeys ) {			
			if(oResultDBData.containsKey(sKey)) {
				sDBValue = oResultDBData.get(sKey);
				sUIValue = oResultUIData.get(sKey);				
			} else {				
				sDBValue = "";
				sUIValue = oResultUIData.get(sKey);
			}
			
			sResult = comparisonAll(sKey,sDBValue,sUIValue);
			
			if(sResult.equals("fail")) {
				iFieldsFailed++;
			}			
			
		}
		
		if(iFieldsFailed>0)			
			System.out.println("No of Fields Failed: " +iFieldsFailed);
		else
			System.out.println("All the fields looks good");
		
		
	}
	
	public static String comparisonAll(String sKey, String sDBValue,String sUIValue) {
		
		try {			
			if(sDBValue.equalsIgnoreCase(sUIValue)) 
				return "PASS";
			else {
				System.out.println("Comparison Failed for Key: "+sKey+", "+"DBValue- "+sDBValue+", "+"UIValue- "+sUIValue );		
				return "fail";	
			}
				
		}
		catch (Exception e) {			
			System.out.println("Exception thrown: "+e.getMessage() );
			return "fail";
		}
		
		
		
		
	}

}
