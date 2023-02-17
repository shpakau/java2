import java.util.Scanner;

public class zadacha {

    public static void main(String[] args) {
        try (Scanner tru = new Scanner(System.in)) {
            int number;
            System.out.println("Enter number");

            for (int i = 2; i <= 1000; i++) {
                if (i % 1 == 0 || i % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
