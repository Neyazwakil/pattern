import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int st = 1;
        int m = (2*n)-1;
        int num = 1;
        for(int i = 1 ;i<=m;i++)
        {
            for(int j = 0;j<st;j++)
            {
                if(j%2==0)
                {
                    System.out.print(num+"\t");
                }
                else {
                    System.out.print("*\t");
                }
            }
            System.out.println() ;
            if(i<n) {
                num++;
                st+=2;
            }
            else {
                num--;
                st-=2;
            }

        }
    }
}