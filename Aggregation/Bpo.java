public class Bpo extends Company{
    String name;
    boolean isItITcompany;
    Accounting accounting;
    Quality quality;

    void supporting()
    {
        System.out.println("provide customer supporting");

    }
    void service()
    {
        System.out.println("provide services");
    }
    Bpo()
    {

    }
    Bpo(String name,boolean isItITcompany,Accounting accounting,Quality quality)
    {
        this.name=name;
        this.isItITcompany=isItITcompany;
        this.accounting=accounting;
        this.quality=quality;
    }
}