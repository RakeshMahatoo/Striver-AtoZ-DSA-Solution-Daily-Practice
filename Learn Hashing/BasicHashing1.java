

public class BasicHashing1 {
    public static void  main(String[] args) {
        int n=5;
        int arr[] = {1,3,2,1,3};
        int check[] = {1,4,2,3,12};
        // create hash array (frequency count)
 
        int hash[] = new int[1000];

        // precompute
        for(int i=0; i<arr.length; i++){
                hash[arr[i]]++;
        }

        // fetch ans

        System.out.println("checking frequency");
        for(int i=0; i<check.length; i++){
           int ans =  hash[check[i]];
           System.out.println("numebr " + check[i] + " appears " + ans + " times");
        }

    }
}
