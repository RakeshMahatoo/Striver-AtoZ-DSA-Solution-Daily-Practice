
import java.util.Scanner;
public class InserstionSort3{

    public static void insertSort(int arr[], int n){
        for (int i = 1; i < n; i++) {
            int current = arr[i]; // element to be inserted 
            int previous = i - 1; // Index of last sorted element
            // shift elements to the right to make space
            while (previous >= 0 && arr[previous] > current) {
                arr[previous + 1] = arr[previous]; // shirf right
                previous--;                        // move left
            }
            //insert current element at correct position
            arr[previous + 1] = current;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter 6 elements:");
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        insertSort(arr, n);

        System.out.println("Sorted array:");
        for (int num : arr) {  // ✅ FIXED: use num directly
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
