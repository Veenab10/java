public class Book{

     String bookName;
     String authorName;
    int publishedYear;
    int price;
    String publisherName;
    String bookType;

    Book(String bookName,String authorName,int publishedYear,int price,String publisherName, String bookType)
    {
        this.bookName=bookName;
        this.authorName=authorName;
        this.publishedYear=publishedYear;
        this.price=price;
        this.publisherName=publisherName;
        this.bookType=bookType;
    }
    
    public void display()
    {
        System.out.println("bookName="+bookName);
        System.out.println("authorName="+authorName);
        System.out.println("publishedYear="+publishedYear);
        System.out.println("price="+price);
        System.out.println("publisherName="+publisherName);
        System.out.println("bookType="+bookType);
    }
	public void readBook()
    {
       System.out.println("Reading Book");
		
    }
	public void getBookTitle()
	{
		System.out.println("Get Book Title");
	}
	public void getPublicationYear()
	{
		System.out.println("Get Publication Year");
	}

	public static void main(String args[])
	{
		Book book=new Book("Cprogramming","Dennis Riche",1989,250,"pearson","Story");
		book.display();
		book.readBook();
		book.getBookTitle();
		book.getPublicationYear();
	}

    
}