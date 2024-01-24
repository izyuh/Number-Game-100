import java.util.Scanner;

public class Main {
    public static  void main(String [] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I am thinking of a number. \n Lets see if you can guess it . " +
                "I will give you five six tries to guess it correctly or else you lose. \n Ready?\n Enter either 'y' or 'Yes'");

        String ready = scanner.next();
        ready  = ready.toLowerCase();

        while (true){
            if(ready.equals("y")| ready.equals("yes")){
                System.out.println("Lets begin.");
                break;
            }else{
                System.out.println("Let me know when you are ready to start.");
                ready = scanner.next();
            }
        }

        int correctNumber = (int) (Math.random() * 100);
        correctNumber = Math.round(correctNumber);

        System.out.println("I am thinking of a number between 1-100. I will inform you if the number I am thinking of is higher or lower.");

        int i = 0;

        while(i < 6 ) {

            String userInput = scanner.next();

            while (true){
            if(userInput.matches("[0-9]+")){
                break;
            }else {
                System.out.println("Please enter a valid number.");
                userInput = scanner.next();
                continue;
                }
            }

            int userInputNumber = Integer.parseInt(userInput);

            if (userInputNumber == correctNumber) {
                Thread.sleep(500);
                System.out.println("Congratulations, you have guessed the number!!");
                System.exit(1);
            } else if (userInputNumber < correctNumber) {
                Thread.sleep(500);
                System.out.println("The number is higher");
                i++;
            } else {
                Thread.sleep(500);
                System.out.println("The number is lower.");
                i++;
            }
        }

        if(i > 5){
            Thread.sleep(2000);
            System.out.println("\nUnfortunately you lost but hopefully you will have better luck next time.\n The number we were looking for was " + correctNumber + ".");
            System.exit(0);
        }

    }
}