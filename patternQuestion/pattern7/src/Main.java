import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 int n =sc.nextInt();
 for( int i =0;i<n ;i++){
     for(int j =0;j< n ;j++){
         if(i==0||j==0 || i==n-1|| j==n-1){
             System.out.print("*\t");
         }
         else{
             System.out.print("\t");
         }
     }
     System.out.println();
 }
    }
}