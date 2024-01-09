public class Shoe{
    String brandName;
    int price;
    int size;
    String color;
    String materialType;
    String heelType;

    Shoe(String brandName,int price,int size,String color,String materialType,String heelType)
    {
        this.brandName=brandName;
        this.price=price;
        this.size=size;
        this.color=color;
        this.materialType=materialType;
        this.heelType=heelType;
    }
    public void display()
    {
        System.out.println("brandName="+brandName);
        System.out.println("price="+price);
        System.out.println("size="+size);
        System.out.println("color="+color);
        System.out.println("materialType="+materialType);
        System.out.println("heelType="+heelType);
    }
    static void wearShoes()
    {
        System.out.println("Wear Shoes");
    }
    static void removeShoes()
    {
        System.out.println("Remove Shoes");
    }
    static void checkSize()
    {
        System.out.println("Check Size");
    }

    public static void main(String args[])
    {
        Shoe shoe=new Shoe("layasa",426,4,"white","Rubber","Flat");
        shoe.display();
        Shoe.wearShoes();
        Shoe.removeShoes();
        Shoe.checkSize();

    }
}

