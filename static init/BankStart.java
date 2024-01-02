public class BankStart{
    public static void main(String args[])
    {
        Bank bank=new Bank(37612003456l,20,"Bagalkot");
        bank.bankDetails();
        System.out.println("-------------------------");
        Bank.bankHistory();
    }
}