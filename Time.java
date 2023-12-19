public class Time{
	
	
	Time()
	{
		System.out.println("No parameters constructor");
	}
	Time(int num)
	{
		System.out.println(num);
	}
	Time(float num)
	{
		System.out.println(num);
	}
	Time(int num,float num1)
	{
		
		System.out.println(num+","+num1);
	}
	Time(float num1,int num)
	{
		System.out.println(num1+","+num);
	}

	
	public static void main(String args[])
	{
		new Time();
		new Time(80);
		new Time(22.34f);
		new Time(70,2.142f);
		new Time(45.44f,45);
	}
}	