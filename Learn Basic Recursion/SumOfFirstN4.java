public class SumOfFirstN4 {

    public static int sumOfFirstN(int n){
        // base case
        if(n == 1){
            return 1;
        }
        // print 
       
        // recursive function   
        return n + sumOfFirstN(n-1);
    }
    public static void main(String[] args) {

        int n = 5;
       int ans =  sumOfFirstN(n);
       System.out.println(ans);
    }
}
