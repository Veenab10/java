public class Data extends It{
    int noOfData;
    String type;
    

    void opertions()
    {
        System.out.println("Do operations using data");
    }
    void generateReport()
    {
        System.out.println("generating report");
    }
    Data(int noOfData,String type)
    {
        this.noOfData=noOfData;
        this.type=type;
    }
}