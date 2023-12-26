class Fibonacci
{
public static void main(String args[])
{
int f1=0,f2=1,f3,n;
n=Integer.parseInt(args[0]);
System.out.println("The Fibonacci series upto "+n+ " terms are : ");
System.out.println(f1+"\n"+f2+"\n");
for(int i=2;i<n;i++)
{
f3 = f1 + f2;
f1 = f2;
f2 = f3;
System.out.println(f3+"\n");
}
}
}