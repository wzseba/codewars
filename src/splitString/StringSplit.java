package splitString;

public class StringSplit {

	public static String[] solution(String s) {

		if (s.length() == 0) {
			String[] letras = new String[0];
			return letras;
		}

		String result = "";

		if (s.length() % 2 != 0) {
			s = s.concat("_");
		}

		int end = 0;
		for (int i = 0; i < s.length(); i += 2) {
			// solucion = s.split("(?<=\\G.{2})");
			end += 2;

			result += s.substring(i, end) + ",";
		}

		return result.split(",");
	}

	public static void main(String[] args) {
		String[] res = StringSplit.solution("");
		System.out.println((res.length));
	}
}
