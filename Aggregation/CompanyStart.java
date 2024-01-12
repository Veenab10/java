public class CompanyStart{
    public static void main(String args[])
    {
        Employees employee = new Employees("veena",164);
        Manager manager = new Manager("xxx@gmail.com",100);
        Company company = new Company("Banglore","private",employee,manager);
        company.planning();
        company.employees.communication();
        company.manager.planning();
        System.out.println("------------------------");

        Accounting accounting=new Accounting(20000,"employee");
        Quality quality=new Quality("good",true);
        Bpo bpo=new Bpo("Call center",false,accounting,quality);
        bpo.supporting();
        bpo.accounting.entry();

        Bpo bpo1=new Bpo("Call center",false,accounting,quality);
        bpo1.quality.improvement();
        System.out.println("------------------------");


        Software software=new Software("Application Software",true);
        Data data=new Data(2000,"workes data");
        It it=new It(1000,10,software,data);
        it.maintainance();
        it.software.dataManagement();

        It it1=new It(1000,10,software,data);
        it1.data.generateReport();

        
    }
}