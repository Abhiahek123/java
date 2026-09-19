public class nthNodeFromEnd {

    public static Node nthNode(Node head , int n) {
        int size =0;
        Node temp = head;
        while(temp !=null) {
            size++;
            temp = temp.next;
        }

        int m = size-n+1;

        // mth node from start

        temp = head;
        for(int i=1; i<=m-1; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public static Node nthNode2(Node head , int n) {
        Node slow = head;
        Node fast = head;
        for(int i=1; i<=n; i++) {
            fast = fast.next;
        }

        while(fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void nthNodeRemove(Node head , int n) {
        Node slow = head;
        Node fast = head;

        for(int i=1; i<=n; i++) {
            fast = fast.next;
        }

        if(fast==null) {
            head = head.next;
            return ;
        }

        while(fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
    }

    public static  void display(Node head) {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
   

     public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(100);
        Node d = new Node(500);
        Node e = new Node(55);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Node temp =a;
        // while(temp!=null) {
        //     System.out.print(temp.data +" ");
        //     temp = temp.next;
        // }


        // Node q = nthNode(a,2);
        // Node q = nthNode2(a,2);
        //   System.out.println(q.data);
        display(a);
        nthNodeRemove(a,4);
        display(a);
     }
}