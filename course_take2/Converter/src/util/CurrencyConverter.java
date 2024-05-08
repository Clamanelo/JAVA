package util;

public class CurrencyConverter {
	public static double dolarValur;
	public static double dolarBuy;
	public static double IOF=6;
	public static double calcule() {
		return (dolarBuy*dolarValur)+((dolarValur*dolarBuy)/IOF);
	}
}
