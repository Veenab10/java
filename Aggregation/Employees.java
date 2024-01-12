public class Employees extends Company 
 {
    String name;
    int id;

    void communication()
    {
        System.out.println("Employee communicate with company");
    }
    void Collaboration()
    {
        System.out.println("Employees can work with colleagues to achieve common goals");
    }
    
    Employees(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    
}