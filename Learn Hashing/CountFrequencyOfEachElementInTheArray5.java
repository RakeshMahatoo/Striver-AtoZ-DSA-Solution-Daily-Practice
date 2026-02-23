
import java.util.HashMap;
public class CountFrequencyOfEachElementInTheArray5 {
    public static void main(String[] args) {
        // input
        int arr[] = {2,2,3,4,4,2};

        // create hasmap
        HashMap<Integer,Integer> map = new HashMap<>();
        //division rule

        for(int num : arr)
        {
        int freq = map.getOrDefault(num, 0);
        int newFreq = freq + 1;
        map.put(num, newFreq);
        System.out.println("element " + num + " : " + " freq " + freq + " new freqcy " + newFreq );
        }

        // display all frequecy

        for(int key : map.keySet()){
            int frequency = map.get(key);
            System.out.println("Element " + key + " : " +" appears " + frequency);
        }


        // find max frequency

        int maxFreq = 0;
        int maxElement = 0;
        for(int key : map.keySet()){
            int currentFreq = map.get(key);

            if(currentFreq> maxFreq){
                maxFreq = currentFreq;
                maxElement = key;
            }
        }

        System.out.println("MAX FREQ IN HASH MAP");

        System.out.println("Element " + maxElement + " max appears " + maxFreq);


       

        // what ever hashindex has max numbr of value return that one
    }
}
