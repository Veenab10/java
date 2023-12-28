public class AccentureCompany{

    static String companyName="Accenture";
    static String ceo="Juli Sweet";
    static int startedYear=1989;
    int noOfEmployees;
    int noOfRoles;
    String location;
    boolean isItStartupCompany;

    AccentureCompany(int noOfEmployees,int noOfRoles,String location, boolean isItStartupCompany )
    {
        this.noOfEmployees=noOfEmployees;
        this.noOfRoles=noOfRoles;
        this.location=location;
        this.isItStartupCompany=isItStartupCompany;
    }

    void displayDetails()
    {
        System.out.println("company Name="+companyName);
        System.out.println("CEO="+ceo);
        System.out.println("Company started Year="+startedYear);
        System.out.println("no Of Employees="+noOfEmployees);
        System.out.println("no Of Roles="+noOfRoles);
        System.out.println("location="+location);
        System.out.println("Is It Startup Company="+isItStartupCompany);
        
    }
}