package RecursionProblem;

import java.util.Scanner;

public class PpowerQ {
    static int ppowerq(int p,int q){
        if(q==0)  {
        return 1;
        }
        return p*ppowerq(p,q-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of P:");
        int p=sc.nextInt();
        System.out.print("Enter value of Q:");
        int q=sc.nextInt();
        System.out.println(ppowerq(p,q));
    }
    
}
