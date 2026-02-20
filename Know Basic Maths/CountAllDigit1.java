
public class CountAllDigit1{

    public static int countDigit(int n){
        int count = 0;
            while(n>0){
                n = n/10;
                count = count + 1;
    

            }
            return count;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("n "+ n);
        int digit = countDigit(n);
        System.out.println(digit);
    }
}