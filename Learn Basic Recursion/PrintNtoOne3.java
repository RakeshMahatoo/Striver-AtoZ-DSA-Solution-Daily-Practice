public class PrintNtoOne3 {

    public static void printNto1(int n){
        // base case
        if(n == 0){
            return;
        }
        // print count
            System.out.println(n);
        // recursive call
        printNto1(n-1 );
    }
    public static void main(String[] args) {
        int n = 4;
        printNto1(n);
    }
}
