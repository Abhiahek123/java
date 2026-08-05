class alloperation {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        
        // char at index 0
        
        System.out.println(sb.charAt(0));
        
        // set char at index 0
        
        sb.setCharAt(0,'P');
        System.out.println(sb);
        
        //insert
        
        sb.insert(0, 'S');
        System.out.println(sb);

        //delete

        sb.delete(2,3);
        System.out.println(sb);

        // add char at end with help of append

        sb.append( 'S');
        sb.append( 'S');
        sb.append( 'S');
        sb.append( 'S');
        sb.append( 'S');
        sb.append( 'S');
        System.out.println(sb);




    }
    
}
