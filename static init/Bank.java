public class Bank{
    static String bankName;
    static String ifscNumber;
    static String location;
    long accountNumber;
    int noOfStaffs;
    String branchName;

    Bank(long accountNumber, int noOfStaffs,String branchName )
    {
        this.accountNumber=accountNumber;
        this.noOfStaffs=noOfStaffs;
        this.branchName=branchName;
    }
    
    static
    {
            bankName="Unin Bank";
            ifscNumber="UBINO537616";
            location="Bagalkot";
    }
    static void bankHistory()
    {
        System.out.println("Bank Name:"+bankName);
        System.out.println("IFSC Number:"+ifscNumber);
        System.out.println("Location:"+location);
    }
    public void bankDetails()
    {
        System.out.println("Account Number:"+accountNumber);
        System.out.println("No of staffs:"+noOfStaffs);
        System.out.println(" Branch Name:"+branchName);
    }




}