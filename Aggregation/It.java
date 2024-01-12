public class It extends Company{
    int noOfEmployees;
    int noOfDepartment;
    Software software;
    Data data;
    

    void assign()
    {
        System.out.println("Assining the work");
    }
    void maintainance()
    {
        System.out.println("maintaining the work");
    }
    It()
    {
        
    }
    It(int noOfEmployees,int noOfDepartment,Software software,Data data)
    {
        this.noOfEmployees=noOfEmployees;
        this.noOfDepartment=noOfDepartment;
        this.software=software;
        this.data=data;
    }

}