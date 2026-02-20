import java.util.*;
public class GcdTwoNumber4{

    public static int findGCD(int n1, int n2){
        ArrayList<Integer> factors1 = new ArrayList<Integer>();
        ArrayList<Integer> factors2 = new ArrayList<Integer>();
        
        // Find factors of n1
        for(int i = 1; i <= n1; i++){
            if(n1 % i == 0){
                factors1.add(i);
            }
        }
        
        // Find factors of n2
        for(int i = 1; i <= n2; i++){
            if(n2 % i == 0){
                factors2.add(i);
            }
        }
        
        // Find common factors
        int gcd = 1;  // Start with 1 (every number has 1 as a factor)
        for(int factor : factors1){ // Loop through [1, 3, 9]
            if(factors2.contains(factor)){ // Is this factor also in factors2?
                gcd = factor;   // Yes? Update gcd
            }
        }
        
        return gcd;
    }
    
    public static void main(String[] args){
        int n1 = 9;
        int n2 = 12;
        int ans = findGCD(n1, n2);
        System.out.println("The Greatest Common Factor is: " + ans);
    }
}