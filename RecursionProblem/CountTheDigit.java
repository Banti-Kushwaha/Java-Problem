package RecursionProblem;

import java.util.Scanner;

public class CountTheDigit {
    static int count=0;
    static int countthedigit(int n){
        if(n>0){
        count++;
        countthedigit(n/10);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Any Digit:");
        int n=sc.nextInt();
        System.out.println(countthedigit(n));
    }
    
}
