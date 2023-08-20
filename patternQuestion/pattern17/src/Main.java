import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int n =sc. nextInt();
         int star=n/2;
         int space=1;
         for( int i =0;i<n ;i++){
             for( int j=0;j<star;j++){
                 System.out.print("*\t");
             }
             for( int j=0;j<space;j++){
                 System.out.print("\t");
             }
             for( int j=0;j<star;j++){
                 System.out.print("*\t");

             }
             System.out.println();
             if(i<n/2){
                 star--;
                 space+=2;

             }
             else{
                 star++;
                 space-=2;
             }
         }
    }
}