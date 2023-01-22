import java.util.*;

public class CheckPermutation {
	public static boolean IsPermutation(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		int[] arr = new int[256];
		for(int i = 0 ; i < s1.length(); i++){
			int x = s1.charAt(i);
			arr[x]++;
			x = s2.charAt(i);
			arr[x]--;
		}
		
		for(int i = 0; i < 256; i++){
			if(arr[i] != 0) return false;
		}
		return true;
	}
	public static void main(String[] args){
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for(String[] pair : pairs){
			boolean flag = IsPermutation(pair[0], pair[1]);
			System.out.println(pair[0] + ", " + pair[1] + ": " + flag);
		}
	}
}