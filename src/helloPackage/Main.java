
package helloPackage;
import java.util.Scanner;

public class Main extends Counter  {

    public static void main(String[] args) {


        Counter unitCount = new Counter();
        unitCount.getValue();






        System.out.println("Welcome to Apartment Finder!");
        System.out.println("Please type for a search");
        System.out.println("        ");
        System.out.println("'studio'");
        System.out.println("'one bedroom'");
        System.out.println("'two bedroom'");
        System.out.println("'three bedroom'");
        System.out.println("'user' (I am currently a renter and need assistance)'");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();



        if(input.equals("studio")){
            System.out.println("You selected STUDIO");
            System.out.println("Currently we have " + unitCount.bedS + " units");
            studioInfo();
        }
        if(input.equals("one bedroom")){
            System.out.println("You selected ONE BEDROOM");
            System.out.println("Currently we have " + unitCount.bedOne + " units");
            System.out.println("Here is what we found: ");
            oneBedInfo();
        }
        if(input.equals("two bedroom")){
            System.out.println("You selected TWO BEDROOM");
            System.out.println("Currently we have " + unitCount.bedTwo + " units");
            System.out.println("Here is what we found: ");
            twoBedInfo();
        }
        if(input.equals("three bedroom")){
            System.out.println("You selected THREE BEDROOM");
            System.out.println("Currently we have " + unitCount.bedThree + " units");
            System.out.println("Here is what we found: ");
            threeBedInfo();
        }
        if(input.equals("user")){
            OneBedApartment request = new OneBedApartment();
            System.out.println("Enter your apartment number");
            Scanner scanner = new Scanner(System.in);
            Object input2 = scanner.nextLine();


           // if(((String) input2).charAt(0) == 3){
                //System.out.println("You are on FLOOR 3");
                //request.getRequest("Apartments 01-99");
                //request.setRequest(input2.toString());




            request.setRequest(input2.toString());
            request.getRequest(""+ scanner);








        }





    }

     /*static void checkFloor() {




    }*/

    public static void threeBedInfo() {
        String threeBedRent = "$1900";
        String availableUnits = "6";
        String availableFloors = "2, 3, 5";
        String moveInDates = "May, August, September";
        System.out.println("Rent: " + threeBedRent);
        System.out.println("Available Units: " + availableUnits);
        System.out.println("Available Floors: " + availableFloors);
        System.out.println("Move-in dates: " + moveInDates);

        OneBedApartment threeBedPrice = new OneBedApartment();
        threeBedPrice.roomThree("$1900");

        threeBedAmmenities();





    }

    public static void oneBedInfo() {
         String oneBedRent = "$1300";
         int oneBedRentNumber = 1300;
         String availableUnits = "10";
         String availableFloors = "1, 2, 4";
         String moveInDates = "April, June, July, August";
        System.out.println("Rent: " + oneBedRent);
        System.out.println("Available Units: " + availableUnits);
        System.out.println("Available Floors: " + availableFloors);
        System.out.println("Move-in dates: " + moveInDates);

        OneBedApartment oneBedApartment = new OneBedApartment();
        oneBedApartment.roomOne("$1300");


        System.out.println("Would you like to rent this? ");
        System.out.println("yes or no ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("yes")){
            Counter nn = new Counter();
            nn.getValue();
            nn.decrement();
            System.out.println("there are now " + nn.bedOne + " ONE BEDROOM units left");
            System.out.println("Thank you for your business! A representative will contact you \n" +
                    "shortly");
            nn.toString();



        }


        directory();






    }

    public static void studioInfo() {
        String studioRent = "$1100";
        String availableUnits = "8";
        String availableFloors = "1, 2, 3, 4";
        String moveInDates = "April, May, June, July, August";
        System.out.println("Rent: " + studioRent);
        System.out.println("Available Units: " + availableUnits );
        System.out.println("Available Floors: " + availableFloors);
        System.out.println("Move-in dates: " + moveInDates);

        OneBedApartment studioPrice = new OneBedApartment();
        studioPrice.roomStudio("$1100");



        System.out.println("Would you like to see more about our STUDIO apartments?");
        System.out.println("'yes' or 'no' ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("yes")){
            studioAmenities();
        }if(input.equals("no")){
            System.out.println("Going to site directory");
            directory();
        }






    }

    public static void studioAmenities() {
        boolean garageParking = false;
        boolean permitParking = false;
        boolean POOL_ACCESS = true;
        boolean GYM_ACCESS = true;
        boolean inUnitWasherDryer = true;
        System.out.println("Covered garage parking: ");
        if(garageParking ==false){
            System.out.println("no");
            directory();//was directory
        }
        System.out.println("Permit Parking: ");
        if(permitParking==false){
            System.out.println("no");
            directory();//
        }
        System.out.println("Pool and Gym access: Yes");
        System.out.println("In unit washer and dryer: " );
        if(inUnitWasherDryer == true){
            System.out.println("yes");
            directory();

        }





    }

    public static void twoBedInfo(){
        String twoBedRent = "$1600";
        String availableUnits = "18";
        String availableFloors = "1, 4, 5";
        String moveInDates = "April, June, July, August";
        System.out.println("Rent: " + twoBedRent);
        System.out.println("Available Units: " + availableUnits);
        System.out.println("Available Floors: " + availableFloors);
        System.out.println("Move-in dates: " + moveInDates);

        OneBedApartment twoBedApartment = new OneBedApartment();
        twoBedApartment.roomTwo("$1600");

        System.out.println("Would you like to see more about our TWO BEDROOM apartments?");
        System.out.println("'yes' or 'no' ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("yes")){
            twoBedAmenities();
        }if(input.equals("no")){
            System.out.println("Going to site directory");
            directory();
        }

    }

    private static void twoBedAmenities() {
        boolean garageParking = true;
        boolean permitParking = true;
        boolean POOL_ACCESS = true;
        boolean GYM_ACCESS = true;
        boolean inUnitWasherDryer = true;
        System.out.println("Covered garage parking: ");
        if(garageParking ==true){
            System.out.println("yes");
        }
        System.out.println("Permit Parking: ");
        if(permitParking==true){
            System.out.println("yes");
        }
        System.out.println("Pool and Gym access: Yes");
        System.out.println("In unit washer and dryer: ");
        if(inUnitWasherDryer==true){
            System.out.println("yes");
        }
        twoBedFloorPlans();

    }

    private static void twoBedFloorPlans() {
        System.out.println("Here are the floor plans we currently \n" +
                "have available for the TWO BEDROOM");
        System.out.println("Would you like to lease this TWO BEDROOM? ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("yes")){
            Counter nn = new Counter();
            nn.getValue();
            nn.decrement();
            System.out.println("There are now " + nn.bedTwo + " ONE BEDROOM units left");
            System.out.println("and " + nn.permitParking + " permit parking spots left");
            System.out.println("Thank you for your business! A representative will contact you \n" +
                    "shortly");
            nn.toString();

        }

    }


    public static void directory(){
        System.out.println("What would you like to do next?");
        System.out.println("[1] Leasing Office Information ");
        System.out.println("[2] Hours");
        System.out.println("[3] Other");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("1")){
            leasingOfficeInfo();
        }
        if(input.equals("2")){
            hours();
        }
        if(input.equals("3")){
            System.out.println("Please enter your search");
            //was 'rent'
            search();
        }

    }

    private static void hours() {
        System.out.println("Leasing Office Business Hours: ");
        System.out.println("Mon-Fri 9am-6:30pm");
        System.out.println("Sat 10am-3pm");
        System.out.println("Sun CLOSED");

        System.out.println("Search other building/complex hours");
        System.out.println("[1] Gym hours");
        System.out.println("[2] Pool hours");
        System.out.println("[3] Business Center Hours");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("1")){
            gymHours();
        }
        if(input.equals("2")){
            poolHours();
        }
        if(input.equals("3")){
            businessCenterHours();
        }
    }

    private static void businessCenterHours() {
        System.out.println("Business Center: ");
        System.out.println("NOTE: Available for rent on a 2 hr basis \n" +
                "After, the renter must book the room again ");
        System.out.println("Hours for Rent");
        System.out.println("Mon-Sat 9am-10pm");
        System.out.println("Sun 10am-8pm");
        directory();
    }

    private static void poolHours() {
        System.out.println("Pool hours: ");
        System.out.println("Mon-Fri 5am-10pm ");
        System.out.println("Sat 6am-11pm");
        System.out.println("Sun 6am-8pm");
        directory();
    }

    private static void gymHours() {
        System.out.println("Gym Hours: ");
        System.out.println("24/7");
        System.out.println("Please Note that construction or maintenance \n" +
                "may affect these hours");
        directory();
    }

    private static void leasingOfficeInfo() {
        System.out.println("LEASING OFFICE");
        System.out.println("                ");
        System.out.println("Check with our great staff!");
        EmployeeEmail contact = new EmployeeEmail();
        contact.name = "Stacy ";
        contact.email = "stacyb@apartmentguide.com ";
        contact.phone =" 1(555)232-4566";
        System.out.println(contact.name + contact.email + contact.phone);
    }
    public static void search(){
        System.out.println("Search the site: ");
        System.out.println("Type 'back' to go back to directory");
        System.out.println("or 'lease' to lease this apartment");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("back")){
            directory();
        }
        if(input.equals("lease")){

            Counter nn = new Counter();
            nn.getValue();
            nn.decrement();
            System.out.println("there are now " + nn.bedS + " ONE BEDROOM units left");
            System.out.println("Thank you for your business! A representative will contact you \n" +
                    "shortly");
            nn.toString();
        }
    }



    public void rentPage() {
        System.out.println("Please select the unit you would like to rent");
        System.out.println("How many bedrooms?");
        System.out.println("studio, one, two or three?");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("studio")){
            Counter countStudio = new Counter();
            System.out.println("There are " + bedS + "studio apartments available");
            System.out.println("Enjoy!");
            countStudio.bedS --;
            System.out.println(bedS);
            

            
        }
        
    }

    public void roomStudio(String roomPrice) {

    }

    public static class EmployeeEmail{
        private String name;
        private String email;
        private String phone;

    }
    public static void threeBedAmmenities(){
        boolean garageParking = true;
        boolean permitParking = true;
        boolean POOL_ACCESS = true;
        boolean GYM_ACCESS = true;
        System.out.println("Covered garage parking: ");
        if(garageParking ==true){
            System.out.println("yes");
        }
        System.out.println("Permit Parking: ");
        if(permitParking==true){
            System.out.println("yes");
        }
        System.out.println("Pool and Gym access: Yes");

        System.out.println("Would you like to lease this apartment?");
        System.out.println("Type 'yes' or 'no'");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("yes")){
            Counter nn = new Counter();
            nn.getValue();
            nn.decrement();
            System.out.println("there are now " + nn.bedThree + " ONE BEDROOM units left");
            System.out.println("and " + nn.permitParking + " permit parking spots left");
            System.out.println("Thank you for your business! A representative will contact you \n" +
                    "shortly");
        }
        if(input.equals("no")){
            directory();
        }



    }
    public static void floorPlans(){




    }



}
