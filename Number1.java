public class Number1{
	
	
	Number1()
	{
		System.out.println("No parameters constructor");
	}
	Number1(int num)
	{
		System.out.println(num);
	}
	Number1(float num)
	{
		System.out.println(num);
	}
	Number1(int num,float num1)
	{
		
		System.out.println(num+","+num1);
	}
	Number1(float num1,int num)
	{
		System.out.println(num1+","+num);
	}

	
	public static void main(String args[])
	{
		new Number1();
		new Number1(10);
		new Number1(20.34f);
		new Number1(20,3.142f);
		new Number1(45.64f,40);
	}
}	