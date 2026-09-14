public class maxNumber {

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {10 , 5 , 90 , 35 , 60};
        System.out.println(maxElement(arr));
    }
    
}

