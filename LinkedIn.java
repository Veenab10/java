public class LinkedIn{
	
	
	LinkedIn()
	{
		System.out.println("No parameters constructor");
	}
	LinkedIn(int num)
	{
		System.out.println(num);
	}
	LinkedIn(float num)
	{
		System.out.println(num);
	}
	LinkedIn(int num,float num1)
	{
		
		System.out.println(num+","+num1);
	}
	LinkedIn(float num1,int num)
	{
		System.out.println(num1+","+num);
	}

	
	public static void main(String args[])
	{
		new LinkedIn();
		new LinkedIn(88);
		new LinkedIn(46.34f);
		new LinkedIn(20,65.46f);
		new LinkedIn(45.64f,90);
	}
}	