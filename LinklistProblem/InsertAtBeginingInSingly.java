package LinklistProblem;

public class InsertAtBeginingInSingly {

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
        void insertAtBegining(int val){
            Node newnode=new Node(val);
            newnode.next=start;
            start=newnode;
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
        ll.insertAtBegining(0);
        ll.display();
    }
    
}