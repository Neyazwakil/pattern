import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 2*n-1;
        int a = m-2;
        int b = 1;
        for(int i = 1;i<=n;i++)
        {

            for(int j = 1;j<=b ;j++){
                System.out.print("*\t");

            }

            for(int j = 1;j<=a;j++){
                System.out.print("\t");
            }
            if(i==n){
                b--;

            }
            for(int j = 1;j<=b;j++){

                System.out.print("*\t");
            }
            a-=2;
            b++;

            System.out.println();
        }
    }
}
