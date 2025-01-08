package Queue;
import java.util.Queue;
import java.util.LinkedList;
public class basicQueue {
    public static void main(String[] args){
      Queue<Integer> a=new LinkedList<>();
       System.out.println(a.isEmpty());
       a.add(2);
       a.add(2);
       a.add(3);
       a.add(8);
       System.out.println(a);
    //    System.out.println(a.isEmpty());
    //    System.out.println(a.size());
    //    System.out.println(a.remove());
    //    System.out.println(a);
    //    System.out.println(a.peek());
    //    System.out.println(a.poll());
    //    System.out.println(a);
    //    System.out.println(a.element());
    for(int i=1;i<a.size();i++){
         System.out.println(i);
    }
    }
}
