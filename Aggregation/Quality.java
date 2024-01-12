public class Quality extends Bpo{
    String feedback;
    boolean isItGoodQuality;

    void comparison()
    {
        System.out.println("");
    }
    void adaptability()
    {
        System.out.println("Adaptability the user needs");
    }
    void improvement()
    {
        System.out.println("Improving the quality");
    }
    Quality(String feedback,boolean isItGoodQuality)
    {
        this.feedback=feedback;
        this.isItGoodQuality=isItGoodQuality;
    }
}