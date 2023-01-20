import java.util.*;

public class IsUniqueTwo {
    private static boolean isUniqueChars(String str){
        int index = -1;
        for(int j = 0; j < str.length(); j++) {
            index = str.indexOf(str.charAt(j), j+1);
            if(index != -1){
                return false;
            }
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
