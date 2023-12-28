public class KarnatakaState{

    static String stateName="Karnataka";
    static int namedYear=1973;
    static int noOfDistricts=31;
    long noOfPeople;
    int noOfLanguages;
    int noOFITCompanies;
    String numberplate;

    KarnatakaState(long noOfPeople, int noOfLanguages, int noOFITCompanies, String numberplate )
    {
        this.noOfPeople=noOfPeople;
        this.noOfLanguages=noOfLanguages;
        this.noOFITCompanies=noOFITCompanies;
        this.numberplate=numberplate;
    }

    public void displayDetails()
    {
        System.out.println("stateName="+stateName);
        System.out.println("namedYear="+namedYear);
        System.out.println("noOfDistricts="+noOfDistricts);
        System.out.println("noOfPeople="+noOfPeople);
        System.out.println("noOfLanguages="+noOfLanguages);
        System.out.println("noOFITCompanies="+noOFITCompanies);
        System.out.println("numberplate="+numberplate);
    }
}