

class implementation {
    public static void main(String[] args) {
        // int [] arr = {10,20,30,40,50};
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);


        int [] arr = new int[4];
         arr[0] = 10;
         arr[1] = 20;
         arr[2] = 30;
         arr[3] = 40;
        //  for(int i=0; i<=3; i++) {
        //     System.out.println(arr[i]);

        //  }
         

        int n = arr.length;

        for(int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}