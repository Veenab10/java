public class Car{
    String brandName;
    long price;
    String color;
    int noOfAirBags;
    int mileage;
    String fuelType;

    Car(String brandName,long price,String color,int noOfAirBags,int mileage,String fuelType)
    {
        this.brandName=brandName;
        this.price=price;
        this.color=color;
        this.noOfAirBags=noOfAirBags;
        this.mileage=mileage;
        this.fuelType=fuelType;
    }
    
    public void display()
    {
        System.out.println("brandName="+brandName);
        System.out.println("price="+price);
        System.out.println("color="+color);
        System.out.println("noOfAirBags="+noOfAirBags);
        System.out.println("mileage="+mileage);
        System.out.println("fuelType="+fuelType);
    }
    public void activateAirConditioning()
    {
        System.out.println("Activate Air Conditioning / Heating");
    }
    public void checkEngineHealth()
    {
        System.out.println("Checking Engine Health");
    }
    public void checkingTirePressure()
    {
        System.out.println("Check Tire Pressure");
    }

    public static void main(String args[])
    {
        Car car=new Car("Tata",60000000,"Blue",6,18,"CNG&petrol");
        car.display();
        car.activateAirConditioning();
        car.checkEngineHealth();
        car.checkingTirePressure();
    }
}