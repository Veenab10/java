public class BagalkotDistrict{

    static String districtName="Bagalkot";
    static int pincode=587101;
    static int namedYear=1997;
    int noOfvillages;
    int noOfColleges;
    int noOfBanks;
    int areaSize;

    BagalkotDistrict(int noOfvillages, int noOfColleges, int noOfBanks, int areaSize)
    {
        this.noOfvillages=noOfvillages;
        this.noOfColleges=noOfColleges;
        this.noOfBanks=noOfBanks;
        this.areaSize=areaSize;
    }

    public void displayDetails()
    {
        System.out.println("districtName="+districtName);
        System.out.println("pincode="+pincode);
        System.out.println("namedYear="+namedYear);
        System.out.println("noOfvillages="+noOfvillages);
        System.out.println("noOfColleges="+noOfColleges);
        System.out.println("noOfBanks="+noOfBanks);
        System.out.println("areaSize="+areaSize);
    }
}