public class Brand{

    public static void main(String args[])
    {
        DharwadUniversity obj1=new DharwadUniversity(40, 50,"Pavate Nagar",25);
        obj1.displayDetails();

        System.out.println("                              ");

        DharwadUniversity obj2=new DharwadUniversity(25, 40,"Near Jubli Circle",20);
        obj2.displayDetails();

        System.out.println("________________________________________");

        JssCollege clg1=new JssCollege(800,60,"Vidyagiri",true);
        clg1.displayDetails();

        System.out.println("                              ");

        JssCollege clg2=new JssCollege(1000,80,"GandiNagar",true);
        clg2.displayDetails();

         System.out.println("________________________________________");

        AccentureCompany company1=new AccentureCompany(2000,60,"koramangala",false);
        company1.displayDetails();

        System.out.println("                              ");

        AccentureCompany company2=new AccentureCompany(1400,40,"Vasanth Nagar",false);
        company2.displayDetails();

         System.out.println("________________________________________");

         LenovoLaptop laptop1=new LenovoLaptop(1000,500000,"Gray","Windows11");
         laptop1.displayDetails();

        System.out.println("                              ");

         LenovoLaptop laptop2=new LenovoLaptop(2000,55000,"Black","Windows10");
         laptop2.displayDetails();

         System.out.println("________________________________________");

         KarnatakaState state1=new KarnatakaState(61095297l,150,5000,"KA19EQ1316");
         state1.displayDetails();

         System.out.println("                              ");


         KarnatakaState state2=new KarnatakaState(5729319l,200,4000,"KA19P8488");
         state2.displayDetails();

         System.out.println("________________________________________");

         BagalkotDistrict dist1=new BagalkotDistrict(96,40,50,6593);
         dist1.displayDetails();

         System.out.println("                              ");


         BagalkotDistrict dist2=new BagalkotDistrict(90,35,25,6590);
         dist2.displayDetails();

         System.out.println("________________________________________");

         SamsungTv tv1=new SamsungTv(65000,"Black",2,20.5f);
         tv1.displayDetails();

        System.out.println("                              ");

         SamsungTv tv2=new SamsungTv(5000,"Gray",1,10.5f);
         tv2.displayDetails();

         System.out.println("________________________________________");

         VtechInstitution vtech1=new VtechInstitution(5000,5,"Vidyagiri",8932468472l);
         vtech1.displayDetails();

         System.out.println("                              ");


         VtechInstitution vtech2=new VtechInstitution(6000,4,"Btm",9967543219l);
         vtech2.displayDetails();

         System.out.println("________________________________________");

         RedmiPhone phone1=new RedmiPhone(20000,"Blue","Redmi Note 11t",1);
         phone1.displayDetails();

         System.out.println("                              ");


         RedmiPhone phone2=new RedmiPhone(19000,"Black","Redmi Note9",1);
         phone2.displayDetails();

         System.out.println("________________________________________");

         Prestige val1=new Prestige(20000,2,19,1380);
         val1.displayDetails();

         System.out.println("                              ");

         Prestige val2=new Prestige(15000,1,18,1200);
         val2.displayDetails();

         System.out.println("________________________________________");





    }
}