public class Print1toN2 {

    public static void printOnetoN(int n, int count){
        // base case
        if(count == n+1){
            return;
        }
         // print 
        System.out.println(count);

         // 
        printOnetoN(n, count + 1);

    }
    public static void main(String[] args) {
        int n = 10;
        int count = 1;

        printOnetoN(n, count);
    }
}
