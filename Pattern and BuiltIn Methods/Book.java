public class Book{

public static void main(String args[])
{
	String value="programming";
	char[] arr=value.toCharArray();
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}

	Book result = new Book();
	int val=result.compare(arr,'m');
	System.out.println("Occurence="+val);


}

  int compare(char[] arr,char ch)
{
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==ch)
		{
			count++;
		}
	}
	return count;
	
}

}


