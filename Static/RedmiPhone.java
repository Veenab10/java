public class RedmiPhone{
    static String brandName="Redmi";
    static int launchedYear=2013;
    static String website="WWW.mi.com";
    int price;
    String colour;
    String version;
    int warranty;

    RedmiPhone(int price,String colour, String version, int warranty)
    {
        this.price=price;
        this.colour=colour;
        this.version=version;
        this.warranty=warranty;
    }

    public void displayDetails()
    {
        System.out.println("brandName="+brandName);
        System.out.println("launchedYear="+launchedYear);
        System.out.println("website="+website);
        System.out.println("price="+price);
        System.out.println("colour="+colour);
        System.out.println("version="+version);
        System.out.println("warranty="+warranty);
    }
}