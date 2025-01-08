package LinklistProblem.RecursionProblem;

import java.util.Scanner;

public class FibonacciNumber {
    public static int fibonacci(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        int prev=fibonacci(n-1);
        int prevprev=fibonacci(n-2);
        return prev+prevprev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(fibonacci(i)+" ");
        }
        }
}
