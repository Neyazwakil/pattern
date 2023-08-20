import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
          int n = sc. nextInt();
          for( int i=n;i>=0 ;i--) {
              for (int j = 0; j < n - i; j++) {
                  System.out.print("\t");
              }
              for (int j = 0; j < i; j++) {
                  System.out.print("*\t");
              }
              for(int j=1;j<i;j++){
                  System.out.print("*\t");
              }
              System.out.println();
          }

    }
}