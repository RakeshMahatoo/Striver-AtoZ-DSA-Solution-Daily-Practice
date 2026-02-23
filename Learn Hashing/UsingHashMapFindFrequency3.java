
import java.util.HashMap;



public class UsingHashMapFindFrequency3 {

    public static void main(String[] args) {
        int n=7;
        int arr[] = {1,2,3,1,3,2,12};
        int check[]= {5,1,2,3,4,12};


        HashMap<Integer, Integer> mapArray = new HashMap<>();
        
        for(int i=0; i<n; i++){
            int key = arr[i];
            int freq;

            if(mapArray.containsKey(key)){
               freq =  mapArray.get(key);
            }
            else{
                freq = 0;
            }
            freq++;
            mapArray.put(key,freq);
        }

        System.out.println();

        for(int i : check){
            int frequency = mapArray.getOrDefault(i, 0); // key , default value -> this will give value of that perticular key
            System.out.println(i + " appears " + frequency + " times");

        }

    }
}
