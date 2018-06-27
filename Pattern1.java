
public class Pattern1 {
	
	void t1()
	{
		for (int i=1; i<=3; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void t2()
	{
		for (int i=1; i<=2; i++)
		{
			for (int j=2; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main (String[]args)
	{
		Pattern1 p = new Pattern1();
		p.t1();
		p.t2();
	}
}
