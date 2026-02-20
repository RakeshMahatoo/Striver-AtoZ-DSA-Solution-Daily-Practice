public class RevArray7 {
    public static void revArr(int arr[], int newArr[], int count){
        // base case
        if(count == arr.length){  // Fixed: arr.length (no parentheses)
            return;
        }
        
        // Your logic: fill new array
        newArr[count] = arr[arr.length - 1 - count];  // Fixed: use arr.length instead of n
        
        // recursive
        revArr(arr, newArr, count + 1);  // Fixed: pass all params, increment count
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        int newArr[] = new int[arr.length];  // Create new array ONCE
        int count = 0;
        
        revArr(arr, newArr, count);  // Fixed: removed [], pass newArr
        
        // Print after recursion completes
        for(int num : newArr){
            System.out.print(num + " ");
        }
    }
}