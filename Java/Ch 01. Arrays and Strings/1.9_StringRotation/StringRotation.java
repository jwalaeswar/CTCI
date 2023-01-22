import java.util.*;

public class StringRotation {
	private static boolean CheckRotation(String s1, String s2){
		if(s1.length() == s2.length() && s1.length() != 0){
			String x = s1+s1;
			return x.indexOf(s2) != -1;
		}
		return false;
	}
	public static void main(String[] args){
		String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean is_rotation = CheckRotation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + is_rotation);
		}
	}
}