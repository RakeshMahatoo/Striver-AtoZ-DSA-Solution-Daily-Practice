public class ReverseANumber2 {
    
    public static int reverseNum(int n ){
        int reverse = 0;
            while(n>0){
                int digit = n % 10;
                 n = n / 10;
                reverse = (reverse * 10) + digit; 
            }
            return reverse;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("N " + n);
        int reverse = reverseNum(n);
        System.out.println("reverse Num- " + reverse);
    }
}
