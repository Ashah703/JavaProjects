
public class BarCode {
	
	public static String getBarCode(String input) {
		String chars = "0123456789-";
		String[ ] codes = { "||:::", ":::||", "::|:|", "::||:", ":|::|",
	           ":|:|:", ":||::", "|:::|", "|::|:", "|:|::", ""};
		
		String retVal = "|";
		for(int i = 0; i < input.length( ); i++) {
			char c = input.charAt(i);
			int index = chars.indexOf(c);
			String code = codes[index];
			retVal += code + "|"; 
		}
	
		return retVal; 
	
	}

}
