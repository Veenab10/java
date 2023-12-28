public class SamsungTv{

    static String brandName="Samsung";
    static String ceoName="Kyung kye-Hyum";
    static String hrHeadName="Sameer Wadhawan";
    int price;
    String colour;
    int warranty;
    float size;

    SamsungTv(int price,String colour, int warranty, float size  )
    {
        this.price=price;
        this.colour=colour;
        this.warranty=warranty;
        this.size=size;
    }

    public void displayDetails()
    {
        System.out.println("brandName="+brandName);
        System.out.println("ceoName="+ceoName);
        System.out.println("hrHeadName="+hrHeadName);
        System.out.println("price="+price);
        System.out.println("colour="+colour);
        System.out.println("warranty="+warranty);
        System.out.println("size="+size);
    }
}