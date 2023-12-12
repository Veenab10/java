public class Laptop{

	public static void main(String args[])
	{

		add(50,50);
		mul(4.0f,2.5f);
		div(2.5,6.0);
		name('v');
		bool(true);
		addition(1234,9876);
		

	}


	static int add(int no1,int no2)
	{
  		int sum=no1+no2;
  		System.out.println("sum of two numbers="+sum);
  		return sum;
	}

	static float mul(float no1, float no2)
	{
		float prod=no1*no2;
		System.out.println("Multiplication="+prod);
		return prod;
	}

	static double div(double no1,double no2)
	{
		double d=no1/no2;
		System.out.println("Division="+d);
		return d;
	}

	static char  name(char char1)
	{
		char n=char1;
		System.out.println("Character="+n);
		return n;
	}



	static boolean bool(boolean b1)
	{
		boolean b=b1;
		System.out.println(b);
		return b;
	}

	static long addition(long a,long b)
	{
		long add=a+b;
		System.out.println(add);
		return add;
	}


}