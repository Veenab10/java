public class Manager extends Company
    {
    String gmail;
    int id;

    void leading()
    {
        System.out.println("Manager lead the company");
    }
    void planning()
    {
        System.out.println("planning");
    }
    
    Manager(String gmail,int id)
    {
        this.gmail=gmail;
        this.id=id;
    }
    
}