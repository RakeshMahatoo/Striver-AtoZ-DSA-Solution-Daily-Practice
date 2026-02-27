

public class SelectionSort1 {

    public static void selectionSortFunc(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int temp;
            for(int j = i+1; j<n; j++){
                if(arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
       
    }
    public static void main(String[] args){
        int arr[] = {9,13,24,52,20,10};
        int n = arr.length;
        selectionSortFunc(arr, n);
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
  