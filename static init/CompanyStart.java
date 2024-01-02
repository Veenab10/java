public class CompanyStart{

    public static void main(String args[])
    {
        System.out.println("static methods");
        Company.companyDetails();
        Company.ceoDetails();
        Company.managerDetails();
        Company.ownerDetails();
        Company.companyhistory();
        System.out.println("----------------------------------");
        System.out.println("Non static methods");
        Company obj=new Company();
        obj.employeeDetails();
        obj.department();
        obj.workersDetails();
        obj.salaryDetails();
        obj.accountDetails();
        
    }
}