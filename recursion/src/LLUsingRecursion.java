public class LLUsingRecursion {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     Node head;
    void add(int data){
        if(head==null){
            head=new Node(data);
        }else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node(data);
        }
    }
    void print(Node curr){
        if(curr==null){
            System.out.println("null");
            return;
        }
        System.out.print(curr.data+"->");
        print(curr.next);

    }
    public static void main(String[] args) {
        LLUsingRecursion ll=new LLUsingRecursion();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print(ll.head);
    }
}