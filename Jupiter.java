public class Jupiter{
	
	
	Jupiter()
	{
		System.out.println("No parameters constructor");
	}
	Jupiter(int num)
	{
		System.out.println(num);
	}
	Jupiter(float num)
	{
		System.out.println(num);
	}
	Jupiter(int num,float num1)
	{
		
		System.out.println(num+","+num1);
	}
	Jupiter(float num1,int num)
	{
		System.out.println(num1+","+num);
	}

	
	public static void main(String args[])
	{
		new Jupiter();
		new Jupiter(34);
		new Jupiter(11.34f);
		new Jupiter(67,3.142f);
		new Jupiter(65.64f,40);
	}
}	