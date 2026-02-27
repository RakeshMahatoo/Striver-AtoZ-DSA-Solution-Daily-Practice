import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FrequencyOfTheMostFrequentElement6 {
    
    // SYNTAX FIX: Changed 'int' back to 'void'
    public static void main(String[] args){
        int nums[] = {1,2,4};
        int k = 5;
        
        ArrayList<Integer> newArr = new ArrayList<>();

        // add new array only less than k
        for(int i: nums){
            if(i<=k){
                newArr.add(i);
            }
        }

        // create Hashmap
        HashMap<Integer,Integer> map = new HashMap<>();

       for(int key : newArr){ //key 1
        int value = k - key;  //  value =  5 -1 = 4
        int keyIncrement =  key + value;  // 1+4 = 5

        int freq= 0;

           freq  = map.getOrDefault(keyIncrement, 0);
           int newFreq = freq + 1;

            map.put(keyIncrement, newFreq);
       }

       // output max freq
       if(map.isEmpty()){
            // SYNTAX FIX: Print instead of return
            System.out.println(1);
       } else {
            // SYNTAX FIX: Print instead of return
            System.out.println(Collections.max(map.values()));
       }
    }
}