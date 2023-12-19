public class Telephone{
	
	
	Telephone()
	{
		System.out.println("No parameters constructor");
	}
	Telephone(int num)
	{
		System.out.println(num);
	}
	Telephone(float num)
	{
		System.out.println(num);
	}
	Telephone(int num,float num1)
	{
		
		System.out.println(num+","+num1);
	}
	Telephone(float num1,int num)
	{
		System.out.println(num1+","+num);
	}

	
	public static void main(String args[])
	{
		new Telephone();
		new Telephone(50);
		new Telephone(10.34f);
		new Telephone(40,3.142f);
		new Telephone(15.64f,90);
	}
}	