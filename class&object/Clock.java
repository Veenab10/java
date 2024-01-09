public class Clock{
    String clockType;
    int size;
    String frameMaterial;
    int price;
    String modelNumber;
    String color;

    Clock(String clockType,int size, String frameMaterial,int price,String modelNumber,String color)
    {
        this.clockType=clockType;
        this.size=size;
        this.frameMaterial=frameMaterial;
        this.price=price;
        this.modelNumber=modelNumber;
        this.color=color;
    }
    public void display()
    {
        System.out.println("clockType="+clockType);
        System.out.println("size="+size);
        System.out.println("frameMaterial="+frameMaterial);
        System.out.println("price="+price);
        System.out.println("modelNumber="+modelNumber);
        System.out.println("color="+color);
        
    }
    public void displayCurrentTime()
    {
        System.out.println("Display Current Time");
    }
    public void setTime()
    {
        System.out.println("Set Time");
    }
    public void startClock()
    {
        System.out.println("Start Clock");
    }

    public static void main(String args[])
    {
        Clock clock=new Clock("Analog",20,"plastic",2500,"MT1202","white");
        clock.display();
        clock.displayCurrentTime();
        clock.setTime();
        clock.startClock();
    }
}