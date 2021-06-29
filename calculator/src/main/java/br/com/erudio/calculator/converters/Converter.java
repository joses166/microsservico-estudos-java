package br.com.erudio.calculator.converters;

public class Converter {

	public static Double convertDouble(String strNumber) {
		if (strNumber.isBlank()) return 0D;
		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}

	public static boolean isNumeric(String strNumber) {
		if (strNumber.isBlank()) return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
