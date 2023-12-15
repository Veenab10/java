public class Book{
    public static void main(String args[])
    {
        int values[]={1,2,3,4,5,6,7,8,};
        System.out.println("Displaying Numbers");
        for (int i=0;i<values.length;i++)
        {
            System.out.println(values[i]);
        }
        System.out.println("Numbers in Reverse Order");
        for (int i=values.length-1;i>=0;i--)
        {
            System.out.println(values[i]);
        }
        System.out.println("Displaying numbers from middle");
        for(int i=(values.length-1)/2;i<values.length;i++)
        {
            System.out.println(values[i]);
        }
        System.out.println("Displaying numbers from middle");
        for (int i=(values.length-1)/2;i>=0;i--)
        {
            System.out.println(values[i]);  
        }
        System.out.println("Printing Even numbers");
        for(int i=0;i<values.length;i++)
        {
            if(values[i]%2==0)
            {
                System.out.println(values[i]);
            }
        }
        System.out.println("printing Odd numbers");
        for(int i=0;i<values.length;i++)
        {
            if(values[i]%2!=0)
            {
                System.out.println(values[i]);
            }
        }
        System.out.println("Sum of all  numbers");
        int sum=0;
        for(int i=0;i<values.length;i++)
        {
            sum=sum+values[i];
        }
        System.out.println(sum);
	
	float numbers[]={6.0f,6.2f,6.23f,6.24f,6.25f,6.26f,6.27f,6.28f};
	System.out.println("Printing Numbers");
	for(int i=0;i<numbers.length;i++)
	{
		System.out.println(numbers[i]);
	}
	System.out.println("Reverse order");
	for(int i=numbers.length-1;i>=0;i--)
	{
		System.out.println(numbers[i]);
	}
	System.out.println("Printing numbers from middle");
	for(int i=(numbers.length-1)/2;i<numbers.length;i++)
	{
		System.out.println(numbers[i]);
	}
	System.out.println("Printing numbers from middle");
	for(int i=(numbers.length-1)/2;i>=0;i--)
	{
		System.out.println(numbers[i]);
	}
	System.out.println("Printing Even Numbers");
	for(int i=0;i<numbers.length;i++)
	{
		if(numbers[i]%2==0)
		{
			System.out.println(numbers[i]);
		}
	}
	System.out.println("printing Odd numbers");
	for(int i=0;i<numbers.length;i++)
	{
		if(numbers[i]%2!=0)
		{
			System.out.println(numbers[i]);
		}
	}
	System.out.println("Sum of all  numbers");
	float sum1=0;
	for(int i=0;i<numbers.length;i++)
	{
		sum1=sum1+numbers[i];
	}
	System.out.println(sum1);


	short shortValues[]={(short)2,(short)5,(short)4,(short)10,(short)12,(short)14,(short)16,(short)19};
	System.out.println("Printing  numbers");
	for(int i=0;i<shortValues.length;i++)
	{
		System.out.println(shortValues[i]);
	}
	System.out.println("Reverse Order");
	for(int i=shortValues.length-1;i>=0;i--)
	{
		System.out.println(shortValues[i]);
	}
	System.out.println("Printing the numbers from middle");
	for(int i=(shortValues.length-1)/2;i<shortValues.length;i++)
	{
		System.out.println(shortValues[i]);
	}
	System.out.println("Printing the numbers from middle");
	for(int i=(shortValues.length-1)/2;i>=0;i--)
	{
		System.out.println(shortValues[i]);
	}
	System.out.println(" Even Numbers");
	for(int i=0;i<shortValues.length;i++)
	{
		if(shortValues[i]%2==0)
		{
			System.out.println(shortValues[i]);
		}
	}
	System.out.println(" Odd Numbers");
	for(int i=0;i<shortValues.length;i++)
	{
		if(shortValues[i]%2!=0)
		{
			System.out.println(shortValues[i]);
		}
	}
	System.out.println("Sum of all numbers");
	int sum2=0;
	for(int i=0;i<shortValues.length;i++)
	{
		sum2=sum2+shortValues[i];
	}
	System.out.println(sum2);

	long longValues[]={2345678,870198,875191477,849841,89710930,80140984,8974872,69248};
	System.out.println("Printing Array Numbers");
	for(int i=0;i<longValues.length;i++)
	{
		System.out.println(longValues[i]);
	}
	System.out.println("Reverse Order");
	for (int i=longValues.length-1;i>=0;i--)
	{
		System.out.println(longValues[i]);
	}
	System.out.println("Printing numbers from middle");
	for(int i=(longValues.length-1)/2;i<longValues.length;i++)
	{
		System.out.println(longValues[i]);
	}
	System.out.println("Printing Numbers from middle");
	for(int i=(longValues.length-1)/2;i>=0;i--)
	{
		System.out.println(longValues[i]);
	}
	System.out.println("Even Numbers");
	for(int i=0;i<longValues.length;i++)
	{
		if(longValues[i]%2==0)
		{
			System.out.println(longValues[i]);
		}
	}
	System.out.println("Odd Numbers");
	for(int i=0;i<longValues.length;i++)
	{
		if(longValues[i]%2!=0)
		{
			System.out.println(longValues[i]);
		}
	}
	System.out.println("Sum of all numbers");
	long sum3=0;
	for(int i=0;i<longValues.length;i++)
	{
		sum3=sum3+longValues[i];
	}
	System.out.println(sum3);

	double doubleValues[]={64.0d,98.9825019d,899.7103910240d,98.7923874019d,981.0439840d,89.031480740d,81.04990d,48.90923032d};
	System.out.println("Printing Numbers");
	for(int i=0;i<doubleValues.length;i++)
	{
		System.out.println(doubleValues[i]);
	}
	System.out.println("Reverse Order");
	for(int i=doubleValues.length-1;i>=0;i--)
	{
		System.out.println(doubleValues[i]);
	}
	System.out.println("Even Numbers");
	for(int i=0;i<doubleValues.length;i++)
	{
		if(doubleValues[i]%2==0)
		{
			System.out.println(doubleValues[i]);
		}
	}
	System.out.println("Odd Numbers");
	for(int i=0;i<doubleValues.length;i++)
	{
		if(doubleValues[i]%2!=0)
		{
			System.out.println(doubleValues[i]);
		}
	}
	System.out.println("Sum of numbers");
	double sum4=0;
	for(int i=0;i<doubleValues.length;i++)
	{
		sum4=sum4+doubleValues[i];
	}
	System.out.println(sum4);
	
    }
}