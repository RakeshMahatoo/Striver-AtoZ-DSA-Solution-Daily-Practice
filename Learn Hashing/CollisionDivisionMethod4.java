public class CollisionDivisionMethod4 {
     public static void main(String[] args) {
         int tableSize = 10;
     int keysArr[] = {25,37,18,55,22,35,50,63};

        System.out.println("Division Method");
        System.out.println("Table Size " + tableSize);
        for(int key : keysArr){
            int hash = key % tableSize;
            System.out.println("key " + key + " -> hash => " + hash   );
        }
     }

}
