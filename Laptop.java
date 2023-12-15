public class Laptop{

	public static void main(String args[])
	{

		add(50,50);
		mul(4.0f,2.5f);
		div(2.5,6.0);
		name('v');
		short no=10;
		number(no);
		bool(true);
		addition(1234,9876);
		byte value1=20;
		cash(value1);

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

static short number(short val1)
{
	short no=val1;
	System.out.println("Short no="+no);
	return no;
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

static byte cash(byte a)
{
	byte value=a;
	System.out.println("Byte value="+value);
	return value;
}
}