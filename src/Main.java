
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        welcome();
    }


    public static void welcome() {
        System.out.println("Welcome to my Dice Game");

        Scanner sc = new Scanner(System.in);
        String response;
        int sum = 0;

        do {


            // Step 1 - roll two dice, tell the user what they got
            int dice1 = (int) (Math.random() * 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);
            int total = dice1 + dice2;
            System.out.println("Your rolls: " + dice1 + " " + dice2);

            // Step 2 - check for 1s in the total


            if (dice1 == 1 && dice2 == 1) {
                System.out.println("SNAKE EYES!");
                total = 25;
            } else if (dice1 == 1 || dice2 == 1) {
                System.out.println("No score this round");
                total = 0;
            }

            //report to user their totals

            sum = sum + total;
            System.out.println("Your score is: " + sum);
            System.out.println("Your total this roll was: " + total);

            if (sum > 100) {
                System.out.println("YOU WIN!!!!");
                response = "n";
            } else {
                // After one game is over, ask if they want to continue
                System.out.println("Do you want to continue: y/n");
                response = sc.nextLine();
                // No need to check for "n" answers here, anything except for "y"
                // will dump us out of the loop
            }
        } while (response.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing!");
    }

}


