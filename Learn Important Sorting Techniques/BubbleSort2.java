public class BubbleSort2 {

    public static void bubbleSort(int[] arr, int n){
     for(int i=0 ; i<n-1; i++){
        for(int j=0; j<n-i-1; j++){
            if(arr[j]> arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
     }
    }
    
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
         
        System.out.println("Original Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        bubbleSort(arr, n);
    }
}


