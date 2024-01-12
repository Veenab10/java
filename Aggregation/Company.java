public class Company 
  {
    String location;
    String type;
    Employees employees;
    Manager manager;

    void createJobs()
    {
        System.out.println("Company creates jobs");
    }
    void planning()
    {
        System.out.println("Company will plan");
    }
    Company()
    {
        
    }
    Company(String location, String type, Employees employees,Manager manager)
    {
        this.location=location;
        this.type=type;
        this.employees=employees;
        this.manager=manager;
       
    }
}