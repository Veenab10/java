public class Office{

    public static void main(String args[])
    {
        String  value="veena";
       boolean res =value.isEmpty();
       System.out.println(res);

       String value1="Programming  ";
       String value2="language";

       System.out.println("without trim method");
       String res2=value1+value2;
       System.out.println(res2);

        System.out.println("                 ");
        
       System.out.println("with trim method");
       String res1=value1.trim()+value2.trim();
       System.out.println(res1);

       String value3="data";
       String res3=value3.valueOf('y');
       System.out.println(res3);

       String str="Database";
       String n=str.substring(4);
       System.out.println(n);

       String language="python Language";
       String result=language.replaceFirst("python","Java");
       System.out.println(result);

       String name="Veena";
       boolean result1=name.equalsIgnoreCase("Veena");
       System.out.println(result1);

       String string="software testing";
       boolean res6=string.startsWith("Software testing");
       System.out.println(res6);

       boolean res7=string.endsWith("software testing");
       System.out.println(res7);

       String case1="LIUNX";
       String lowerCase=case1.toLowerCase();
       System.out.println(lowerCase);

       String case2="xworkz";
       String upperCase=case2.toUpperCase();
       System.out.println(upperCase);

       
    }

}