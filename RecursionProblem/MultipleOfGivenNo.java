package RecursionProblem;
import java.util.Scanner;
public class MultipleOfGivenNo {
    static void mul(int n,int x){
        if(x==1){
            System.out.print(n);
            return;
        }
        mul(n,x-1);
        System.out.print(n*x+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        System.out.print("Enter how many time your are want to multiply:");
        int x=sc.nextInt();
        mul(n,x);
    }
    
}
