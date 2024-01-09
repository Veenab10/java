public class Phone{
     String brandName;
    int price;
    int storage;
    boolean itIsGood;
    String networkType;
    String color;

    Phone(String brandName,int price,int storage,boolean itIsGood,String networkType,String color)
    {
        this.brandName=brandName;
        this.price=price;
        this.storage=storage;
        this.itIsGood=itIsGood;
        this.networkType=networkType;
        this.color=color;
    }
    
    public void display()
    {
        System.out.println("brandName="+brandName);
        System.out.println("price="+price);
        System.out.println("storage="+storage);
        System.out.println("itIsGood="+itIsGood);
        System.out.println("networkType="+networkType);
        System.out.println("color="+color);
    }
    public void makeCall()
    {
        System.out.println("It is use for calling");
    }
    public void sendingMessage()
    {
         System.out.println("It is used for sending message");
    }
    public void takeAPhoto()
    {
        System.out.println("It is used for taking a photo");
    }
    
    public static void main(String args[])
    {
        Phone phone=new Phone("Redmi",20000,128,true,"Jio","Blue");
        phone.display();
        phone.makeCall();
        phone.sendingMessage();
        phone.takeAPhoto();
    }

}