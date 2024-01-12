public class Accounting extends Bpo{
    int balance ;
    String typeName;

    void reporting()
    {
        System.out.println("Reporting the statment and balanace sheet..");
    }
    void entry()
    {
        System.out.println("Balance entry");
    }
    Accounting(int balance,String typeName)
    {
        this.balance=balance;
        this.typeName=typeName;

    }
}