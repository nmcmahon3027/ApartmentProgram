
package helloPackage;
import java.util.Scanner;

public class Main {
    public int status = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Apartment Finder!");
        System.out.println("Please type for a search");
        System.out.println("        ");
        System.out.println("'studio'");
        System.out.println("'one bedroom'");
        System.out.println("'two bedroom'");
        System.out.println("'three bedroom'");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();


        if(input.equals("studio")){
            System.out.println("You selected STUDIO");
            studioInfo();
        }
        if(input.equals("one bedroom")){
            System.out.println("You selected ONE BEDROOM");
            System.out.println("Here is what we found: ");
            oneBedInfo();
        }
        if(input.equals("two bedroom")){
            System.out.println("You selected TWO BEDROOM");
            System.out.println("Here is what we found: ");
            twoBedInfo();
        }
        if(input.equals("three bedroom")){
            System.out.println("You selected THREE BEDROOM");
            System.out.println("Here is what we found: ");
            threeBedInfo();
        }





    }

    private static void threeBedInfo() {
        String threeBedRent = "$1900";
        String availableUnits = "6";
        String availableFloors = "2, 3, 5";
        String moveInDates = "May, August, September";
        System.out.println("Rent: " + threeBedRent);
        System.out.println("Available Units: " + availableUnits);
        System.out.println("Available Floors: " + availableFloors);
        System.out.println("Move-in dates: " + moveInDates);
        directory();

    }

    public static void oneBedInfo() {
         String oneBedRent = "$1300";
         String availableUnits = "10";
         String availableFloors = "1, 2, 4";
         String moveInDates = "April, June, July, August";
        System.out.println("Rent: " + oneBedRent);
        System.out.println("Available Units: " + availableUnits);
        System.out.println("Available Floors: " + availableFloors);
        System.out.println("Move-in dates: " + moveInDates);
        directory();






    }

    public static void studioInfo() {
        String studioRent = "$1100";
        String availableUnits = "8";
        String availableFloors = "1, 2, 3, 4";
        String moveInDates = "April, May, June, July, August";
        System.out.println("Rent: " + studioRent);
        System.out.println("Available Units: " + availableUnits);
        System.out.println("Available Floors: " + availableFloors);
        System.out.println("Move-in dates: " + moveInDates);

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
        System.out.println("Covered garage parking: ");
        if(garageParking ==false){
            System.out.println("no");
        }
        System.out.println("Permit Parking: ");
        if(permitParking==false){
            System.out.println("no");
        }
        System.out.println("Pool and Gym access: Yes");


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
            search();
        }

    }

    private static void hours() {
        System.out.println("Leasing Office Business Hours: ");
        System.out.println("Mon-Fri 9am-6:30pm");
        System.out.println("Sat 10am-3pm");
        System.out.println("Sun CLOSED");
    }

    private static void leasingOfficeInfo() {
        System.out.println("LEASING OFFICE");
        System.out.println("                ");
        System.out.println("Check with our great staff!");
    }
    public static void search(){
        System.out.println("Search the site: ");
        System.out.println("Type 'back' to go back to directory");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("back")){
            directory();

        }
    }
}
