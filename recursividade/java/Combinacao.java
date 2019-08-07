
public class Combinacao {

	public static int Comb(int n, int k) {
		if (k == 1)
			return n;
		
		if (k == n)
			return 1;
		
		if (1 < k && k < n)
			return Comb(n-1, k-1) + Comb(n-1, k);
			
		return 0;
	}
	
	public static int Comb2(int n, int k) {
		return Fat(n) / (Fat(k) * Fat(n-k));
	}
	
	public static int Fat(int n) {
		int f = 1;
		
		for (int i = n; i > 0; i--)
			f = f * i;
		
		return f;
	}
	
	public static void main(String[] args) {
		System.out.println("Versão recursiva: " + Comb(5, 3));
		System.out.println("Versão não recursiva: " + Comb2(5, 3));
	}

}