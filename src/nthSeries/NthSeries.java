package nthSeries;

public class NthSeries {

	public static String seriesSum(int n) {
		// Happy Coding ^_^
		// https://www.codewars.com/kata/555eded1ad94b00403000071/train/java
		final int SERIE = 3;
		if (n == 0) {
			return "0.00";
		}

		if (n == 1) {
			return "1.00";
		}

		double resultado = 1;
		int denominador = 1;
		for (int i = 1; i < n; i++) {
			denominador += SERIE;
			resultado += (double) 1 / denominador;
		}

		return String.format("%.2f", resultado);
	}

}
