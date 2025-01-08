package LinklistProblem;

public class InsertAtBetweenInSingly {

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
        void insertAtBetween(int inx,int val){
            Node newnode=new Node(val);
            Node ptr=start;
            for(int i=0;i<=inx-1;i++){
                ptr=ptr.next;
            }
            newnode.next=ptr.next;
            ptr.next=newnode;
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
        ll.insertAtBetween(2,34);
        ll.display();
    }
    
}