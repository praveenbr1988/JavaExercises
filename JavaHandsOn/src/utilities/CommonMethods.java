package utilities;

public class CommonMethods {


	protected static final String ROWSTARTTAG = "<TR style='border:2px solid black'>";
	protected static final String ROWENDTAG = "</TR>";
	protected static final String COLUMNSTARTTAG = "<TD style='border:2px solid black; width: 120px'>";
	protected static final String COLUMNENDTAG = "</TD>";
	protected static final String TABLESTARTTAG = "<TABLE style='border=2px solid black; table-layout: fixed'>";
	protected static final String TABLEENDTAG = "</TABLE>";
	protected static final String HEADERSTARTTAG = "<TH style='border:2px solid black; width: 120px'><font size='2'>";
	protected static final String HEADERENDTAG = "</TH>";
	
	
	public static String getTableStartTag(String heading) {
		return TABLESTARTTAG + "<CAPTION><B><font size='3'>" + heading + "</B></CAPTION>";
	}
	
	public static String getTableEndTag() {
		return TABLEENDTAG;
	}
	
	public static String getHeaderWithColumns(String [] sColumns) {
		String sTotal = ROWSTARTTAG;
		for(int iColumn = 0; iColumn<sColumns.length;iColumn++) {
			sTotal+=HEADERSTARTTAG + sColumns[iColumn] + HEADERENDTAG;
		}
		return sTotal + ROWENDTAG;		
	}
	
	public static String getRowWithColumns(String[] sColumnValues) {
		String sTotal = ROWSTARTTAG;
		for(int iColumn = 0; iColumn<sColumnValues.length; iColumn++ ) {
			sTotal += COLUMNSTARTTAG + sColumnValues[iColumn] + COLUMNENDTAG;	
		}
		return sTotal + ROWENDTAG;		
	}
	
	
	public static String getStatusWithColor(String status) {
		
		switch(status.toUpperCase()) {
		
		case "PASS" : return "<b><font color='green'>" + status + "</font></b>";
		case "FAIL" : return "<b><font color='red'>" + status + "</font></b>";
		default: return status;
		}
	}
	

}
