import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n/2;
        int b = -1;

        for(int i  = 1;i<=n;i++)
        {

            for(int j = 1;j<=a;j++)
            {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int j =1;j<=b;j++)
            {
                System.out.print("\t");
            }
            if(i>1&&i<n)
            {
                System.out.print("*\t");
            }

            if(i<(n/2)+1)
            {
                a--;
                b+=2;
            }
            else
            {
                a++;
                b-=2;
            }
            System.out.println();
        }
    }
}