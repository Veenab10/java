public class Sweater{
    String color;
    String pattern;
    int price;
    String styleCode;
    String brandName;
    String countryOfOrigin;

    Sweater(String color, String pattern,int price,String styleCode,String brandName,String countryOfOrigin)
    {
        this.color=color;
        this.pattern=pattern;
        this.price=price;
        this.styleCode=styleCode;
        this.brandName=brandName;
        this.countryOfOrigin=countryOfOrigin;

    }
    public void display()
    {
        System.out.println("color="+color);
        System.out.println("pattern="+pattern);
        System.out.println("price="+price);
        System.out.println("styleCode="+styleCode);
        System.out.println("brandName="+brandName);
        System.out.println("countryOfOrigin="+countryOfOrigin);
    }
    public void wearSweater()
    {
        System.out.println("Wear Sweater");
        
    }
    public void removeSweater()
    {
        System.out.println("Remove Sweater");
        
    }
    public void checkSize()
    {
        System.out.println("Check Size");
        
    }
    public static  void  main(String args[])
    {
        Sweater sweater=new Sweater("Black","Solid",389,"WFJSB","ROARERS","India");
        sweater.display();
        sweater.wearSweater();
        sweater.removeSweater();
        sweater.checkSize();

    }
   
    
    
    
    


}

    
