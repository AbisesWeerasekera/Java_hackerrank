/*
Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of  to , print Not Weird
If n is even and in the inclusive range of  to , print Weird
If n is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer,n .

Constraints
1<=n<=100
Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
 */


package Hackerrank_Solutions;

import java.util.Scanner;

public class Java_If_Else {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(!(N%2==0)){
            System.out.println("Weird");
        }else if(N%2==0 && 2<=N && N<=5){
            System.out.println("Not Weird");
        }else if(N%2==0 && 6<=N && N<=20){
            System.out.println("Weird");
        } else if(N%2==0 && N>20){
            System.out.println("Not Weird");
        }


        scanner.close();
    }
}
