public class Basic {

    // print with recursively

    public  static  void displayr(Node head) {
        if(head == null) return ;
        System.out.print(head.data +" ");
        displayr(head.next);
    }


    public static void displayreverse (Node head) {
        if(head == null) return ;
         displayreverse(head.next);
         System.out.print(head.data +" ");
    }

   // print with function call
    public static  void display(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }


    public static  int length(Node head) {
        int count =0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return  count;

    }

    public static class Node {
        int data;
        Node next;

        Node(int data) { // Constructor
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5); // object
        Node b = new Node(3); 
        Node c = new Node(9); 
        Node d = new Node(8); 
        Node e = new Node(16);

        // linded

        a.next = b;
        b.next = c;
        c.next = d;
        d.next =e;
        
        // print linked list  jb sie mallom ho

        // Node temp = a;
        // for(int i=1; i<=5; i++) {
        //     System.out.print(temp.data+ " ");
        //     temp = temp.next;
        // }


        // print linked list jb size mallom na ho

        // Node temp = a;
        // while(temp != null) {
        //      System.out.print(temp.data+ " ");
        //      temp = temp.next;
        // }



    // print with function

    //   display(a);
    //   System.out.println();
    //   displayr(a);
    //   System.out.println();
    //   displayreverse(a);

    // print length

    System.out.print(length(a));


        
    }
}