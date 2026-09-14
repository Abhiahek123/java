public class CountEven {

    public static int count_Even(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] %2==0) {
                count++;
            }
        }

        return count;

        
    }


    public static void main(String[] args) {
        int arr[] = {40 , 5 , 3 ,8};
        System.out.println(count_Even(arr));
        
    }
}
