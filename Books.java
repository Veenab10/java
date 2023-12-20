public class Books{

    String bookName;
    int noOfPages;
    String authorName;
    int bookPrice;
    int publishedYear;
    String publisher;
    String bookType; 

    Books(String bookName,int noOfPages, String authorName, int bookPrice, int publishedYear, String publisher, String bookType )
    {
        this.bookName=bookName;
        this.noOfPages=noOfPages;
        this.authorName=authorName;
        this.bookPrice=bookPrice;
        this.publishedYear=publishedYear;
        this.publisher=publisher;
        this.bookType=bookType;
    }

    void printBookDetails()
    {
        System.out.println("Book Name="+bookName);
        System.out.println("No Of Pages="+noOfPages);
        System.out.println("Author Name="+authorName);
        System.out.println("Book Price="+bookPrice);
        System.out.println("published Year="+publishedYear);
        System.out.println("publisher="+publisher);
        System.out.println("Book Type="+bookType);
    }

    public static void main(String args[])
    {
        Books book1=new Books("Thoughts To Inspire",136,"Swami Vivekanad",125,2018,"Amazing Reads","self-help book");
        book1.printBookDetails();

        System.out.println("_____________________________________");

        Books book2=new Books("The Secret Garelen", 236,"Frances Hodgson Burnett",649,1911,"Frederick A.stokes Company","Children's novel");
        book2.printBookDetails();

        System.out.println("_____________________________________");

        Books book3=new Books("The Power Of Positive Thinking",244,"Norman Vincent peale",222,1952,"Vayu Education Of India", "self-help book");
        book3.printBookDetails();

        System.out.println("_____________________________________");

        Books book4=new Books("My Idea Of Education",279,"Raja-yoga", 400,1896,"Vedanta Press","Exhaustive");
        book4.printBookDetails();

        System.out.println("_____________________________________");

        Books book5=new Books("A Story Of Struggle",200,"Ashok Kumawat",104,2020,"Kumawat","Motivational fiction");
        book5.printBookDetails();

        System.out.println("_____________________________________");

        Books book6=new Books("The peacefull Mind",180,"Mikkell K.Khan",344,2020,"Joseph Neyyan","Emotional Intelligence");
        book6.printBookDetails();

        System.out.println("_____________________________________");

        Books book7=new Books("Java Programming",400,"John Doe",2200,2020,"Tech BooksInc","Programming");
        book7.printBookDetails();

        System.out.println("_____________________________________");







    }
}