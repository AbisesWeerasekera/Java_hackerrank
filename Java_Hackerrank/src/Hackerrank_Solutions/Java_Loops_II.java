package Hackerrank_Solutions;

import java.util.Scanner;

public class Java_Loops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int count = 0;
        int num= 0;
        for(int i=0;i<1;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j=0;j<n;j++){
                num = (int)(a+(Math.pow(2, j)*b));
                count += num;
                System.out.printf("%d ", count);
            }
            //System.out.println();

        }

        in.close();
    }

}
