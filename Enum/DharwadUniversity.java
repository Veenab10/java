public class DharwadUniversity{

     static String universityName;
     static int universityNumber;
     static String universityWebsite;
     int noOfStaff;
     int noOfWorkers;
     String universityAddress;
     int noOfColleges;

     DharwadUniversity(int noOfStaff, int noOfWorkers, String universityAddress, int noOfColleges)
     {
        this.noOfStaff=noOfStaff;
        this.noOfWorkers=noOfWorkers;
        this.universityAddress=universityAddress;
        this.noOfColleges=noOfColleges;
     }

     void displayDetails()
     {
        System.out.println("university Name="+universityName);
        System.out.println("university Number="+universityNumber);
        System.out.println("university Website="+universityWebsite);
        System.out.println("no Of Staff="+noOfStaff);
        System.out.println("no Of Workers="+noOfWorkers);
        System.out.println("university Address="+universityAddress);
        System.out.println("no Of Colleges="+noOfColleges);

     }

}