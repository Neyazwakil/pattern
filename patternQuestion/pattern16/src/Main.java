import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("\t");

            }
            for (int j = i; j <= n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
