import javax.print.attribute.standard.Destination;
import javax.xml.stream.Location;
import java.util.Objects;
import java.util.Scanner;

public class information {
    public static void landingmenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your current location");
        String Location = sc.next();
        System.out.println("Where would you like to go");
        String Destination = sc.next();
        System.out.println("These are the flights available from " + Location + " to " + Destination);
        System.out.println("Here is the time schedule");
        System.out.println("-------------------------------");
        System.out.println("[1] Departure--> 7:00 am | 2pm <-- Arrival ");
        System.out.println("[2] Departure--> 9:00 am | 4pm <-- Arrival  ");
        System.out.println("[3] Departure--> 2:00 pm | 9pm <-- Arrival ");
        System.out.println("[4] Departure--> 5:00 pm | 3am <-- Arrival");
        System.out.println("Please select a flight Schedule convenient foy you");
        int time_select = sc.nextInt();
        switch (time_select){
            case 1:
                System.out.println("Your Time for Departure will be by 7:00 am and arrival will be 2:00 pm please endeavour to be present 1hr ahead of departure time  ");
                break;
            case 2:
                System.out.println("Your Time for Departure will be by 9:00 am and arrival will be 4:00 pm please endeavour to be present 1hr ahead of departure time  ");
                break;
            case 3:
                System.out.println("Your Time for Departure will be by 2:00 am and arrival will be 9:00 pm please endeavour to be present 1hr ahead of departure time  ");
                break;
            case 4:
                System.out.println("Your Time for Departure will be by 5:00 am and arrival will be 3:00 pm please endeavour to be present 1hr ahead of departure time  ");
                break;
            default:
                System.out.println("Invalid selection");
                break;
        }


    }
    public void customer_details(){
//        The mini database for the stored user(1)
        String key_password = "open";
        String key_email ="billy24@specs.com";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Email:" );
        String email = sc.next();
        System.out.println("Please enter your Password:" );
        String password = sc.next();
        if(Objects.equals(email, key_email) && Objects.equals(password, key_password)){
            System.out.println("Account access successful");
        }
        else{
            System.out.println("Wrong email or Password");
            System.exit(0);
        }
        landingmenu();
    }
    public void customer_registration(){
        String tool = "no";
        int key_code = 1234;
        String resend = "no";
        Scanner sc = new Scanner(System.in);
        System.out.println( "FirstName:");
        String Firstname = sc.next();
        System.out.println( "LastName:");
        String Lastname = sc.next();
        System.out.println( "EmailAddress:");
        String emailaddress = sc.next();
        System.out.println( "Password:");
        String Password = sc.next();
        System.out.println("Congratulations "+Firstname+ " "+ Lastname+ ". Your password "+ "(" +Password+ ")" + " has been saved and a code has been sent to your email address "+ emailaddress+  " \n  Have you seen it? " );
        tool = sc.next();
        if(Objects.equals(tool, "Yes") || Objects.equals(tool, "YES") || Objects.equals(tool, "yes")){
            System.out.println("Please enter code");
            int code = sc.nextInt();
            if (code == key_code) {
                System.out.println("Account has been successfully created");
                landingmenu();
            }else{
                System.out.println("Wrong input");
                System.exit(0);
            }
        } if(Objects.equals(tool, "no") || Objects.equals(tool, "NO") || Objects.equals(tool, "No")){
            System.out.println("Please be sure you entered an active email, Please re enter details");
            customer_registration();
            }
        else{
            System.out.println("Wrong input");
        }
        }
    }


