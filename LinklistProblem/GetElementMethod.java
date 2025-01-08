package LinklistProblem;

public class GetElementMethod {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static class Linklist{
        Node start=null;
        Node temp=null;

        void create_node(int val){
            Node newnode=new Node(val);
            if(start==null){
                start=newnode;
                temp=newnode;
            }
            else{
                temp.next=newnode;
                temp=newnode;
            }
        }
        void display(){
            Node ptr=start;
            while(ptr!=null){
                System.out.print(ptr.data+" ");
                ptr=ptr.next;
            }
            System.out.println();
        }
        int getelement(int idx){
            Node ptr=start;
            for(int i=1;i<=idx;i++){
                ptr=ptr.next;
            }
           return ptr.data;
        }
    }
    public static void main(String[] args) {
        Linklist ll=new Linklist();
        ll.create_node(1);
        ll.create_node(2);
        ll.create_node(3);
        ll.create_node(4);
        ll.create_node(5);
        ll.display();
        int check=ll.getelement(3);
        System.out.println("This element is present.you are given the index:"+check);
    }
    
}