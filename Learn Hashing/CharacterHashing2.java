
public class CharacterHashing2 {

    public static void main(String[] args) {
        String s = "abcdabehf"; // string
        char check[] = {'a','g','h','b','c'}; // character to be check

        int hash[] = new int[26]; // crate hash array
       
        // pre compute
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        // fetch 
        System.out.println("check frequencey of character");
        for (int i = 0; i < check.length; i++) {
            int ans = hash[check[i] - 'a'];
            System.out.print("Character " + "index " + i + " " +check[i] + " Frequency " + ans + " times\n");
        }
    }
}
