
import java.util.Locale;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers pair do you enter:");
        int n = sc.nextInt();

        int[] numberPair = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number:");
            numberPair[i] = sc.nextInt();
        }

        System.out.println("Numbers pairs:");

        int totalNumberPairs = 0;
        for (int i = 0; i < n; i++) {
            if(numberPair[i] % 2 == 0) {
                System.out.print(numberPair[i]+" ");
                totalNumberPairs = totalNumberPairs + 1;
            }
        }
        System.out.println();
        System.out.println("Number of even numbers:" +totalNumberPairs);

        sc.close();
    }
}
