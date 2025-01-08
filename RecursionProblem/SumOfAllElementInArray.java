package RecursionProblem;

public class SumOfAllElementInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int x=sum(arr,0);
        System.out.println(x);
    }

    private static int sum(int[] arr, int idx) {
        if(idx==arr.length){
            return 0;
        }
        int smallAns=sum(arr,idx+1);
        return arr[idx]+smallAns;
    }
    
}
