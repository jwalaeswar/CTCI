import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.*;

public class IsUnique {
    private static boolean isUniqueChars(String str){
        List<Character> map = new ArrayList<Character>();
        for(int j = 0; j < str.length(); j++){
            if(map.contains(str.charAt(j))){
                return false;
            } else {
                map.add(str.charAt(j));
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
