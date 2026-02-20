public class PrintNameNtime1 {
    public static void recAns(int n, String name, int count) {
        // base case
        if (count == n) {
            return;
        }

        // print the name;
        System.out.println(name);

        // recursive call with incremented count
        recAns(n, name, count + 1);
     }
      public static void main(String[] args) {
        int n = 3;
        String name = "ram";
        int count = 0;
        recAns(n, name, count);

    }
}
