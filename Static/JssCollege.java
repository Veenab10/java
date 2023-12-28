public class JssCollege{

    static String collegeName="JSS SMI UG PG COLLEGE DHARWAD";
    static String website="WWW.jsscolllegedharwad.con";
    static String emailId="prinicipaljsscollegedwd@gm";
    int noOfStudents;
    int noOflectures;
    String collegeAddress;
    boolean feedbackIsGood;

    JssCollege(int noOfStudents, int noOflectures, String collegeAddress, boolean feedbackIsGood)
    {
        this.noOfStudents=noOfStudents;
        this.noOflectures=noOflectures;
        this.collegeAddress=collegeAddress;
        this.feedbackIsGood=feedbackIsGood;
    }
    void displayDetails()
    {
        System.out.println("college Name="+collegeName);
        System.out.println("website="+website);
        System.out.println("emailId="+emailId);
        System.out.println("no Of Students="+noOfStudents);
        System.out.println("no Of lectures="+noOflectures);
        System.out.println("college Address="+collegeAddress);
        System.out.println("feedback Is Good="+feedbackIsGood);

    }
}