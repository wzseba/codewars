package findoutlier;

public class FindOutlier {
	/* https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java */
	static int find(int[] integers) {
		/* tambien se podria verificar los 3 primeros numeros de la matriz */
		int par = 0;
		int impar = 0;
		int conti = 0;
		int contp = 0;

		for (int i : integers) {
			if (i % 2 == 0) {
				contp++;
				par = i;
			} else {
				conti++;
				impar = i;
			}
		}

		return contp > conti ? impar : par;
	}
}
