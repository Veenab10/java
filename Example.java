public class Example{
	
	public static void main(String args[])
	{
	
		
		int add=sum();
		System.out.println("addition="+add);
		

		float pr=price();
		System.out.println("price="+pr);

		double val=value();
		System.out.println("Double value="+val);

		char c=name();
		System.out.println("character="+c);
	
		boolean bool=play();
		System.out.println(bool);

		byte by=count();
		System.out.println(by);
	
		long l=square();
		System.out.println(l);

		short returnedvalue=distance();
		System.out.println(returnedvalue);




	}
	static int sum()
	{
		int addition=199999;
		return addition;

	}

	static float price()
	{
		float p=20.9999f;
		return p;
	}


	static double value()
	{
		double d=2.39999999999999999999999;
		return d;
	}

	static char name()
	{
		char Name='v';
		return Name;
	}

	static boolean play()
	{
		boolean b=true;
		return b;
	}

	static byte count()
	{
		byte b=122;
		return b;
	}

	static long square()
	{
		long s=2987654321l;
		return s;
	}

	static short distance()
	{
		short v=20000;
		return v;
	}
}