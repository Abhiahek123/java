public class doublyll {

    public static  class Node {
        int val;
        Node next;
        Node prev;


        Node(int val) {
            this.val = val;
        }
    }

    public  static  void display(Node head) {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public  static  void displayrev(Node tail) {
        Node temp = tail;
        while(temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }


    public static  void display2(Node random) {
        Node temp = random;
        while(temp.prev != null) {
            temp = temp.prev;
        }

        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public  static  Node insertAtHead(Node head , int x) {
        Node t = new Node(30);
        t.next = head;
        head.prev = t;
        head = t;
        return head;


    }


    public  static  void insertAtTail(Node head ,  int x) {
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }

        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }

    public  static  void insertAtIdx(Node head , int idx , int x) {
        Node s = head;
        for(int i=1; i<=idx-1; i++) {
            s = s.next;
        }

        Node r = s.next;
        Node t = new Node(x);
         s.next = t;
         r.prev = s;
         t.next = r;
         r.prev=t;
    }


    public static void main(String[] args) {

        Node a = new Node(4);
        Node b = new Node(8);
        Node c = new Node(12);
        Node d = new Node(16);
        Node e = new Node(20);

        a.prev = null;
        b.prev = a;
        a.next = b;
        c.prev= b;
        b.next = c;
        d.prev = c;
        c.next=d;
        e.prev=d;
        d.next = e;
        e.next = null;

        // display(a);
        // displayrev(e);

        // display2(c);

        // Node newhead = insertAtHead(a,35);
        // display(newhead);

        // insertAtTail(a , 90);
        // display(a);
        

        insertAtIdx(a,4,87);
        display(a);
    }
    
}
