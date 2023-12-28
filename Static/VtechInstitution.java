public class VtechInstitution{
    static String institutionName="Vtech";
    static int courseDuration=6;
    static int startedYear=1976;
    int fees;
    int noOfBatches;
    String location;
    long institutionNumber;

    VtechInstitution(int fees, int noOfBatches, String location, long institutionNumber)
    {
        this.fees=fees;
        this.noOfBatches=noOfBatches;
        this.location=location;
        this.institutionNumber=institutionNumber;
    }

    public void displayDetails()
    {
        System.out.println("institution Name="+institutionName);
        System.out.println("course Duration="+courseDuration);
        System.out.println("started Year="+startedYear);
        System.out.println("fees="+fees);
        System.out.println("no Of Batches="+noOfBatches);
        System.out.println("location="+location);
        System.out.println("institution Number="+institutionNumber);
    }


}