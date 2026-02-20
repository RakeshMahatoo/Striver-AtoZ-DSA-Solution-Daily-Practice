public class Palindrome3 {

    public static int palindrome(int n){
        int reverse = 0;
            while(n>0){
                 int digit = n % 10;
                 n = n / 10;
              reverse = (reverse * 10) + digit; 
        
              
            }
            return reverse;
    
    }
    public static void main(String[] args) {
        int n = 4554;
        System.out.println("input is "+ n);
        int palAns = palindrome(n);
        
               if(n == palAns){
                 System.out.println("palindrome");
                }
                else{
                    System.out.println("No Palindrome");
                }

        

    }
}
