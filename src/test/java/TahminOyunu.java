import java.util.Random;
import java.util.Scanner;

public class TahminOyunu {
    public static void main(String[] args) {

        boolean continueGame;
        while (true) {

            Random random = new Random();
            random.setSeed(System.currentTimeMillis());
            int randomNumber = random.nextInt(101);
            System.out.println(randomNumber);

            continueGame = true;
            int guessRight = 1;
            while (guessRight >= 0) {
                System.out.print("Sayı giriniz: ");
                Scanner scanner = new Scanner(System.in);
                int userGuess = scanner.nextInt();
                if (userGuess == -1) {
                    continueGame = false;
                    break;
                }
                if (userGuess == randomNumber) {
                    System.out.println("Bravo");
                    break;
                } else {
                    if (guessRight == 1) {
                        System.out.println(
                                Math.abs(userGuess - randomNumber) + " kadar yaklaştınız." +
                                        " Tekrar tahmin ediniz."
                        );
                    } else {
                        System.out.println("Kaybettiniz");
                    }
                }

                guessRight--;

            }

            if (!continueGame) {
                break;
            }
        }
    }
}
// -1 girince sonlanmakta