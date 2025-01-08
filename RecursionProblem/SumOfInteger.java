package RecursionProblem;
import java.util.Scanner;
public class SumOfInteger {
    static int sumofdigit(int n){
        if(n>=0 && n<=9) return n;
        
        int x=sumofdigit(n/10);
        int p=n%10;
        return x+p;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Any No:");
        int n=sc.nextInt();
        System.out.println(sumofdigit(n));
    }
    
}
