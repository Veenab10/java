public class Door{
    String color;
    String material;
    String style;
    int size;
    String brandName;
    String occasion;
    Door(String color,String material,String style,int size,String brandName,String occasion)
    {
        this.color=color;
        this.material=material;
        this.style=style;
        this.size=size;
        this.brandName=brandName;
        this.occasion=occasion;
    }
    public void display()
    {
        System.out.println("color="+color);
        System.out.println("material="+material);
        System.out.println("style="+style);
        System.out.println("size="+size);
        System.out.println("brandName="+brandName);
        System.out.println("occasion="+occasion);

    }
    static void openDoor()
    {
        System.out.println("Open Door");
    }
    static void closeDoor()
    {
        System.out.println("Close Door");
    }
    static void lockDoor ()
    {
        System.out.println("Lock Door");
    }

    public static void main(String argsp[])
    {
        Door door=new Door("White","Fabric","Traditional",25,"Saugat Traders","Diwali");
        door.display();
        Door.openDoor();
        Door.closeDoor();
        Door.lockDoor();

    }
}