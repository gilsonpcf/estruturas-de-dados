
public class RaizQuadrada {

	public static double RaizQ(double x, double x0, double e) {
		if (Math.abs(x0*x0 - x) <= e)
			return x0;
		else
			return RaizQ(x, (x0*x0+x)/(2*x0), e);
	}
	
	public static void main(String[] args) {
		System.out.println(RaizQ(13, 3.2, 0.001));
	}
	
}