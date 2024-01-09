public class Bag{
    String brandName;
    String bagType;
    int price;
    String qualityType;
    int warranty;
    String styleCode;

    Bag(String brandName,String bagType,int price,String qualityType,int warranty,String styleCode)
    {
        this.brandName=brandName;
        this.bagType=bagType;
        this.price=price;
        this.qualityType=qualityType;
        this.warranty=warranty;
        this.styleCode=styleCode;

    }
    
    public void display()
    {
        System.out.println("brandName="+brandName);
        System.out.println("bagType="+bagType);
        System.out.println("price="+price);
        System.out.println("qualityType="+qualityType);
        System.out.println("warranty="+warranty);
        System.out.println("styleCode="+styleCode);
    }
    public void addItem()
    {
        System.out.println("Adding Items to list");
    }
    public void removeItem()
    {
        System.out.println("Removing  Item from bag");
        
    }
    public void checkWeight()
    {
        System.out.println("Checking the weight of the bag");
    }

    public static void main(String args[])
    {
        Bag bag=new Bag("Safari","Laptop Bag",400,"polyester",1,"MEGA819CBBLU");
        bag.display();
        bag.addItem();
        bag.removeItem();
        bag.checkWeight();
    }

}