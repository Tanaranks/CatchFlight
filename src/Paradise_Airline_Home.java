import java.util.Objects;
import java.util.Scanner;

public class Paradise_Airline_Home extends information {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Paradise Airlines Booking Application");
        System.out.println("\n Do you have an account already?.  Yes or No");
        String option = sc.next();
        if(Objects.equals(option, "Yes") || Objects.equals(option, "YES") || Objects.equals(option, "yes")){
            information info = new information();
            info.customer_details();
        }else if(Objects.equals(option, "no") || Objects.equals(option, "NO") || Objects.equals(option, "No")){
            information info = new information();
            info.customer_registration();
        } else{
            System.out.println("Invalid input");
            System.exit(0);
        }

        System.out.println("What class would you like to be in");
        System.out.println("[1] Business class \n [2] First class\n [3] Economy");
        int lux = sc.nextInt();
        switch (lux){
            case 1:
                System.out.println("Business class booked, Mind your Business and Enjoy. It cost's $1,700");
                break;
            case 2:
                System.out.println("i believe you were always the first in your class Enjoy. . It cost's $1,200");
                break;
            case 3:
                System.out.println("It is smart to book economy in this economy Enjoy. . It cost's $500");
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
        System.out.println("how would you like to make payment");
        System.out.println("[1]Paradise traveler miles card PTMC \n [2] Bank Transfer");
        int bookay = sc.nextInt();
        try{
        switch (bookay){
            case 1 :
                System.out.println("Enter card details");
                int card_num = sc.nextInt();
                System.out.println("PTMC successfully debited");
                break;
            case 2 :
                System.out.println("Here is the Account number: 333444555");
                System.out.println("Please send receipt after transaction is made ");
                System.out.println("paste receipt T/F");
                boolean rec = sc.nextBoolean();
                if(rec){
                    System.out.println("Payment successful");
                }else{
                    System.out.println("Payment has not been received");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Wrong input");
        }
        System.out.println("Your flight has been booked are you ready to catch these flight or cancel... YES/NO");
        String ready = sc.next();
        if(Objects.equals(ready, "Yes") || Objects.equals(ready, "YES") || Objects.equals(ready, "yes")){
            System.out.println("Lets catch these flights instead of feelings");
        }else if(Objects.equals(ready, "No") || Objects.equals(option, "NO") || Objects.equals(option, "no")){
            System.out.println("FLIGHT CANCELED, your money will be reversed in approximated 1hr");
        }else{
            System.out.println("Wrong input");
        }
    }
        catch (Exception e){
            System.out.println("Enter valid card numbers");
        }

}}