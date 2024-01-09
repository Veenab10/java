public class Calender{
    int year;
    int noOfMonths;
    int noOfWeeks;
    int noOfdays;

    Calender(int year,int noOfMonths,int noOfWeeks,int noOfdays)
    {
        this.year=year;
        this.noOfMonths=noOfMonths;
        this.noOfWeeks=noOfWeeks;
        this.noOfdays=noOfdays;
    }
    public void display()
    {
        System.out.println("year="+year);
        System.out.println("noOfMonths="+noOfMonths);
        System.out.println("noOfWeeks="+noOfWeeks);
        System.out.println("noOfdays="+noOfdays);
    }
    static void viewDailySchedule()
    {
        System.out.println("View Daily Schedule");
    }
    static void displayMonth()
    {
        System.out.println("Display Month");
    }
    static void setReminders ()
    {
        System.out.println("Set Reminders");
    }

    public static void main(String args[])
    {
        Calender cal=new Calender(2024,12,4,365);
        cal.display();
        Calender.viewDailySchedule();
        Calender.displayMonth();
        Calender.setReminders();
    }
}