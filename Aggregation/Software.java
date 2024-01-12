public class Software extends It{
    String type;
    boolean isItSoftwareCompany;

    void development()
    {
        System.out.println("Developing the applications");
    }
    void dataManagement()
    {
        System.out.println("Data Management");
    }
    Software(String type,boolean isItSoftwareCompany)
    {
        this.type=type;
        this.isItSoftwareCompany=isItSoftwareCompany;
    }

}