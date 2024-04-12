import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gnum = ThreadLocalRandom.current().nextInt(1, 7);
        for (int i = 1; i <= 3; i++) {
            System.out.println("guess the number (1-6):");
            int num = sc.nextInt();
            if (num == gnum) {
                System.out.println("you won the match");
                break;
            } else {
                if (i == 3) {
                    System.out.println("you lost the game and you reached max num of attempts");
                } else {
                    System.out.println("wrong guess");
                }
            }
        }
    }
}