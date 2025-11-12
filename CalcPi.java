// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) 
	{
		double calcPi = 1;
		System.out.println("pi according to Java: " + Math.PI);
		int n = Integer.parseInt(args[0])-1;
		double denominator = 3;

		for (int i=0; i<n/2; i++)
		{
			calcPi = calcPi - 1.0/denominator;
			denominator = denominator +2;
			calcPi = calcPi + 1.0/denominator;
			denominator = denominator +2;
		} 
		if (n%2!=0)
		{
			calcPi = calcPi - 1.0/denominator;
		}

		System.out.println("pi, approximated: " + calcPi*4); 
	}
}
