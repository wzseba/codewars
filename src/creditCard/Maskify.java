package creditCard;

public class Maskify {
	public static String maskify(String str) {
		/* https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java */

		if (str.length() <= 3) {
			return str;
		}

		String codificado = "";
		for (int i = 0; i < str.length() - 4; i++) {
			codificado += "#";
		}

		return codificado + str.substring(str.length() - 4);

	}

}
