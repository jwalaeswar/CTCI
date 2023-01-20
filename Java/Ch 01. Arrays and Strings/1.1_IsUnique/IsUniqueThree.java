import java.util.*;

public class IsUniqueThree {
    private static boolean isUniqueChars(String str){
        if(str.length() > 128) return false;
        boolean[] arr = new boolean[128]; 
        for(int j = 0; j < str.length(); j++) {
            int val = str.charAt(j);
            if(arr[val]) return false;
            arr[val] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
    }
}
