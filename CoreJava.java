public class CoreJava{
    public static void main(String []args)
    {
        sum(90,10);
        sum(20,60f);
        sum(2008l,2999l);

        mul(5,6);
        mul(2,4,6);
        mul(1);

        display(12,3.14f,'V');
        display(2.16f,40,'k');
        display('R',9.99f,88);


    }
    static void sum(int num1,int num2)
    {
        int addedvalue=num1+num2;
        System.out.println("Addition of two numbers="+addedvalue);
        System.out.println("1st method");

    }
    static void sum(long num1,long num2)
    {
         long addedvalue=num1+num2;
        System.out.println("Addition of two two numbers="+addedvalue);
        System.out.println("2nd method");
    }
    static void sum(float num1,float num2)
    {
         float addedvalue=num1+num2;
        System.out.println("Addition of two numbers="+addedvalue);
        System.out.println("3rd method");
    }
    static void mul(int val1,int val2,int val3)
    {
        int prod=val1*val2*val3;
        System.out.println("Result="+prod);
        System.out.println("Multiplication of 3 numbers");
    }
    static void mul(int val1,int val2)
    {
        int prod=val1*val2;
        System.out.println("Result="+prod);
        System.out.println("Multiplication of 2 numbers");
    }
    static void mul(int val1)
    {
        int prod=val1;
        System.out.println("Result="+prod);
        System.out.println("Multiplication of 1 number");
    }
    static void display(int num1,float num2,char char1)
    {
        System.out.println("Integer value="+num1);
        System.out.println("Float value="+num2);
        System.out.println("Character="+char1);
    }
    static void display(float num2,int num1,char char1)
    {
        System.out.println("Float value="+num2);
        System.out.println("Interger value="+num1);
        System.out.println("character="+char1);
    }
    static void display(char char1,float num2,int num1)
    {
        System.out.println("character="+char1);
        System.out.println("Float value="+num2);
        System.out.println("Integer value="+num1);
    }
}