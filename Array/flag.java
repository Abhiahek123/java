class flag {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60};
        int  x = 10;
        boolean flags = false;

        for(int i = 0; i<arr.length; i++) {
            if(arr[i]==x) {
                flags = true;
                break;
            }
        }

        if(flags == false ) {
            System.out.println("nahi mila");
        }else {
            System.out.println("mil Mila");
        }
    }
}