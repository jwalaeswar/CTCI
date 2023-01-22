import java.util.*;

public class OneAway {
	private static boolean OneAwayUtil (String s1, String s2) {
		if (Math.abs(s1.length() - s2.length()) > 1) return false;
		int[] arr = new int[256];
		int max = Math.max(s1.length(), s2.length());
		for(int i = 0; i < max; i++){
			int x;
			if(i < s1.length()){
				x = s1.charAt(i);
				arr[x]++;
			}
			if(i < s2.length()) {
				x = s2.charAt(i);
				arr[x]--;
			}
		}
		int pos = 0, neg = 0;
		for(int i = 0; i < 256; i++){
			if( arr[i] != 0) {
				if(arr[i] > 1 || arr[i] < -1){
					return false;
				}
				if(arr[i] == -1){
					neg++;
				}
				if(arr[i] == 1){
					pos++;
				}
			}
		}
		if((pos == 1 && neg == 0) || (pos == 0 && neg == 1) || (pos == 1 && neg == 1)){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		String a = "bake";
		String b = "pale";
		boolean isOneEdit = OneAwayUtil(a, b);
		System.out.println(a + ", " + b + ": " + isOneEdit);
	}
}