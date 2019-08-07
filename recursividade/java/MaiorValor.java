
public class MaiorValor {

	public static int Max(int[] v, int n) {
		if (n == 1)
			return v[0];

		int aux = Max(v, n-1);

		if (v[n-1] > aux)
			return v[n-1];
		else
			return aux;
	}
	
	public static void main(String[] args) {
		int[] v = {3, 5, 7, 2, 1, 10, 9, 6, 4, 8};
		
		System.out.println("Maior elemento: " + Max(v, v.length));
	}

}