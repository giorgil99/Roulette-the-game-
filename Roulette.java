package ge.redScabbards.pirveliMercxali;

import java.util.Random;
import java.util.Scanner;

public class Roulette {

    public static void main(String... args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int cash = 0;
        while (true) {
            if (cash <= 0) {
                System.out.println("Deposit your money");
                cash = scanner.nextInt();
            } else {
                System.out.println("You have " + cash + "$$$");
                System.out.println("Declare your bet number [0-36] : ");
                int betNumber = scanner.nextInt();
                System.out.println("Enter bet amount : ");
                int betCash = scanner.nextInt();
                if (cash >= betCash) {

                    int randomNumber = random.nextInt(37);
                    if (betNumber >= 0) {
                        cash -= betCash;
                        if (randomNumber == betNumber) {
                            System.out.println("*****CONGRATULATION*****");
                            System.out.println("You won " + 36 * betCash + "$$$");
                            cash += 37 * betCash;
                        } else {
                            System.out.println("You lost number was : " + randomNumber);
                        }
                    } else {
                        System.out.println("<<<<<Wrong bet number>>>>>");

                    }

                } else {
                    System.out.println("<<<<<Can't bet that amount>>>>>");
                }
            }
        }
    }
}
