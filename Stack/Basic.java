import  java.util.Stack;
class Basic {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        // System.out.println(st.peek());

        System.out.println(st);

        st.pop();
        System.out.println(st);
        System.out.println("Size is :"+st.size());
    }
}