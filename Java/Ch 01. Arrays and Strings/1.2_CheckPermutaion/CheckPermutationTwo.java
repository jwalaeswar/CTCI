import java.util.*;

public class CheckPermutationTwo{
	private static String sort(String s){
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
	private static boolean IsPermutation(String s1, String s2){
		return sort(s1).equals(sort(s2));
	}
	public static void main(String[] args){
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for(String[] pair : pairs){
			boolean flag = IsPermutation(pair[0], pair[1]);
			System.out.println(pair[0] + ", " + pair[1] + ": " + flag);
		}
	}
}