import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int randomInt;
        randomInt = random.nextInt(10) + 1;

        Scanner console = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the number: ");
            int userInput = console.nextInt();
            if (userInput == randomInt) {
                System.out.println("Right!!!");
                break;
            } else if (userInput < randomInt) {
                System.out.println("The number i have guessed is greater... ");
            } else {
                System.out.println("The number i have guessed is smaller...");
            }
        }
    }

//    public class GuessNumber {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter max turn quantity ");
//            int turnQuantity = console.nextInt();
//            System.out.println("Enter number's lower bound ");
//            int lowerBound = console.nextInt();
//            System.out.println("Enter number's upper bound ");
//            int upperBound = console.nextInt();
//            Random random = new Random();
//
//            int randomInt;
//            randomInt = lowerBound + random.nextInt(upperBound - lowerBound + 1);
//            int counter = 1;
//            boolean status = false;
//            while(counter <= turnQuantity) {
//
//                System.out.println("Enter number");
//                int userInput = console.nextInt();
//
//                if (userInput == randomInt) {
//                    System.out.println("That's right!!!");
//                    status = true;
//                    break;
//                }  else if (userInput < randomInt) {
//                    System.out.println("The number i have guessed is greater... ");
//                } else {
//                    System.out.println("The number i have guessed is smaller...");
//                }
//
//                counter++;
//            }
//            if (status == false) {
//                System.out.println("Game over ");
//                System.out.println("I have guessed number: " + randomInt);
//            }
//        }
//    }
}
