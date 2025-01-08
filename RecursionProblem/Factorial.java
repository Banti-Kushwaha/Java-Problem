package RecursionProblem;

import java.util.Scanner;

public class Factorial {
    static int factorial(int x){
       if(x==1)return 1;
       int z=factorial(x-1);
       return z*x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no:");
        int x=sc.nextInt();
        int y=factorial(x);
        System.out.println(y);
    }
    
}
