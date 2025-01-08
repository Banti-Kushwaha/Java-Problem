package RecursionProblem;

import java.util.Scanner;

public class TargetArePresentInArrayOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Element:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target Element:");
        int x=sc.nextInt();
        boolean check=target(arr,x,0);
        if(check==true){
            System.out.print("Target Element are Present in the Array");
        }
        else{
            System.out.print("Target Element are not present in the Array");
        }
    }

    private static boolean target(int[] arr, int x ,int idx) {
        if(idx>=arr.length) return false;
        if(arr[idx]==x){
            return true;
        }
        return target(arr,x,idx++);  
    }
    
}
