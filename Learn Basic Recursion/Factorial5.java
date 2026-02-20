import java.util.*;
public class Factorial5 {

    public static int factFind(int n){

        // base case
        if(n==0){
            return 1;
        }
        //resursive
        return n * factFind(n-1);
    }
    
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
     int ans =  factFind(n);    
        System.out.println(ans);
    }
}
