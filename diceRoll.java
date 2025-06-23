import java.util.Random;
import java.util.Scanner;

public class diceRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n, i;
        System.out.println("*********BY AYUSHMAN GHOSH***********");
        boolean toPlay = true;
        char f;
        
        System.out.print("Enter number of dice u have : ");
        n = scanner.nextInt();
        scanner.nextLine();
        do {
            int total = 0;
            if (n <= 0) {
                System.out.println("INVALID INPUT !!");
            } else {
                for (i = 0; i < n; i++) {
                    int x = random.nextInt(1, 7);
                    total += x;
                    System.out.printf("DIE %d : %d\n", i + 1, x);
                    printerDie(x);
                    
                }
            }
            System.out.println("Total = " + total);
            System.out.print("Want to try again ? (y/n) : ");
            f = scanner.nextLine().charAt(0);
            if (f == 'y' || f == 'Y') {
                toPlay = true;
            }else{
                System.out.println("Thanks for playing !!");
                toPlay = false;
            }
            

        } while (toPlay);
        scanner.close();
    }

    static void printerDie(int x) {
        String pic = """

                """;
        if (x == 1) {
            pic = """
                     -------
                    |       |
                    |   o   |
                    |       |
                     -------
                     """;
        } else if (x == 2) {
            pic = """
                     -------
                    | o     |
                    |       |
                    |     o |
                     -------
                     """;
        } else if (x == 3) {
            pic = """
                     -------
                    | o     |
                    |   o   |
                    |     o |
                     -------
                     """;
        } else if (x == 4) {
            pic = """
                     -------
                    | o   o |
                    |       |
                    | o   o |
                     -------
                     """;
        } else if (x == 5) {
            pic = """
                     -------
                    | o   o |
                    |   o   |
                    | o   o |
                     -------
                     """;
        } else if (x == 6) {
            pic = """
                     -------
                    | o o o |
                    | o o o |
                    | o o o |
                     -------
                     """;
        }
        System.out.println(pic);
    }
}
