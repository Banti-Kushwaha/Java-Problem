package RecursionProblem;

public class MaxElementOfTheArray {
    public static int max(int[] arr,int idx){
        if(idx==arr.length){
            return arr[idx-1];
        }
        int smallElement=max(arr,idx++);
        return Math.max(arr[idx],smallElement);
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int x=max(arr,0);
        System.out.println(x);

    }
}
