// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) 
	{
		int n = Integer.parseInt(args[0]);
		char mood = args[1].charAt(0);
		int count = 1;
		int seed = 2;
		if (mood == 'c') 
		{
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
		else 
		{
			System.out.println("1 4 2 1 (4)");
			for(int i=1; i<n; i++)
			{
				System.out.print(seed + " ");
				while (seed != 1) 
				{
					if (seed%2==0) 
					{
						seed = seed/2;
					}
					else
					{
						seed = seed*3 +1;
					}
					count++;
					System.out.print(seed + " ");
				}

				System.out.println("(" + count + ")");
				seed = i + 2;
				count = 1;
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
	}
}
