import java.util.Scanner;

public class FortuneTeller {
    /*Part 1
    Ask the user for the user’s first name.
    Ask the user for the user’s last name.
    Ask the user for the user’s age.
    Ask the user for the user’s birth month (as an 'int').
    Ask the user for the user’s favorite ROYGBIV color.

    If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors.

    Ask the user for the user's number of siblings.
    */
    public static void main (String[] args){
        System.out.println("Welcome to the fortuneteller app");

        Scanner scanner1 = new Scanner (System.in);

        System.out.println("What is your first name?");
        String firstName = scanner1.nextLine();
        System.out.println("Great, "+firstName);

        System.out.println("What is your last name?");
        String lastName = scanner1.nextLine();
        System.out.println("Welcome, "+firstName +" "+lastName);

        System.out.println("How old are you, " +firstName +"?");
        int age = scanner1.nextInt();

        System.out.println("What month were you born?");
        int birthMonth = scanner1.nextInt();
        scanner1.nextLine();

        System.out.println("What is your favorite ROYGBIV color? If you don't know what ROYGBIV means, type HELP");
        String favoriteColor = scanner1.nextLine();

        System.out.println("OK, you " +age + " year old fortune seeker that likes " +favoriteColor +" color, "+"how many siblings do you have?");
        int siblingCount = scanner1.nextInt();
        System.out.println("So you have " +siblingCount +" siblings. Nice. Here is your fortune!");
        }






    }

