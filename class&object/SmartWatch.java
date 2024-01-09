public class SmartWatch{
    int price;
    String brandName;
    int size;
    boolean isItTouchScreen;
    String idealFor;
    int batteryLife;

    SmartWatch(int price,String brandName,int size,boolean isItTouchScreen,String idealFor,int batteryLife)
    {
        this.price=price;
        this.brandName=brandName;
        this.size=size;
        this.isItTouchScreen=isItTouchScreen;
        this.idealFor=idealFor;
        this.batteryLife=batteryLife;
    }
    public void display()
    {
        System.out.println("price="+price);
        System.out.println("brandName="+brandName);
        System.out.println("size="+size);
        System.out.println("isItTouchScreen="+isItTouchScreen);
        System.out.println("idealFor="+idealFor);
        System.out.println("batteryLife="+batteryLife);
    }
    static void checkHeartRate ()
    {
        System.out.println("Check Heart Rate");
    }
    static void playMusic()
    {
        System.out.println("It is used to Play Music");
    }
    static void setAlarms()
    {
        System.out.println("Set Alarms");
    }

    public static void main(String args[])
    {
        SmartWatch watch=new SmartWatch(3000,"Boat",4,true,"Girls",2);
        watch.display();
        SmartWatch.checkHeartRate();
        SmartWatch.playMusic();
        SmartWatch.setAlarms();

    }

}