public class Reverse {



    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
     // print linked list
    public static void display(Node head) {
        if(head == null) return ;
        System.out.print(head.val + " ");
        display(head.next);
      
        
    }

    // Print linkedlist in reverse order

    public static void Reversell(Node head) {
        if(head==null) return;
        display(head.next);
        System.out.print(head.val +" ");
        
    }


    public static Node reverse(Node head) {

        if(head.next== null) return head;
        Node newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;

        
        
    }
    
    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);

        a.next =b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Node temp = a;
        // while(temp!=null) {
        //     System.out.print(temp.val+" ");
        //     temp = temp.next;
            
            
        // }


        // display(a);
        // System.out.println();
        // Reversell(a);


        display(a);
        System.out.println();
        Node r = reverse(a);
        display(r);


    }

    
}
