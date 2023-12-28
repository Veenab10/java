public class LenovoLaptop{

    static String brandName="Lenovo";
    static String companyWebsite="WWW.lenovo.com.cn";
    static String founderName="Liu Chuanzhi";
    int noOfEmployees;
    int price;
    String colour;
    String operatingSystem;

    LenovoLaptop(int noOfEmployees, int price, String colour, String operatingSystem)
    {
        this.noOfEmployees=noOfEmployees;
        this.price=price;
        this.colour=colour;
        this.operatingSystem=operatingSystem;

    }

    public void displayDetails()
    {
        System.out.println("Brand Name="+brandName);
        System.out.println("company Website="+companyWebsite);
        System.out.println("founderName="+founderName);
        System.out.println("noOfEmployees="+noOfEmployees);
        System.out.println("price="+price);
        System.out.println("colour="+colour);
        System.out.println("operatingSystem="+operatingSystem);
    }


}