import java.util.*;

public class PalindromePermutation{
	private static boolean isPermutationOfPalindrome(String str){
		str = str.replaceAll("\\s", "");
		str = str.toLowerCase();
		int[] arr = new int[256];
		int len = str.length();
		for(int i = 0; i < len; i++){
			int x = str.charAt(i);
			arr[x]++;
		}
		boolean flag = false;
		for(int i = 0; i < 256; i++) {
			if (len%2 == 0) {
				if(arr[i]%2 != 0) return false;
			}
			else
			{
				if(arr[i]%2 != 0) {
					if(!flag) {
						flag = true;
					}
					else{
						return false;
					}
				}
			}
		}
		return true;
	}
	public static void main(String[] args){
		String pali = "Rats live on no evil star";
		System.out.println(isPermutationOfPalindrome(pali));
	}
}