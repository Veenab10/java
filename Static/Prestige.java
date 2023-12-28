public class Prestige{
    static String brandName="Prestige";
    static String inventorName="Thomas Ahearn";
    static int inventedYear=1882;
    int price;
    int warranty;
    int capacity;
    int voltage;

    Prestige(int price, int warranty, int capacity, int voltage)
    {
        this.price=price;
        this.warranty=warranty;
        this.capacity=capacity;
        this.voltage=voltage;
    }

    public void displayDetails()
    {
        System.out.println("brandName="+brandName);
        System.out.println("inventorName="+inventorName);
        System.out.println("inventedYear="+inventedYear);
        System.out.println("price="+price);
        System.out.println("warranty="+warranty);
        System.out.println("capacity="+capacity);
        System.out.println("voltage="+voltage);
    }
}