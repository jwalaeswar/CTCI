import java.util.*;
import java.lang.*;

public class URLify{
	public static String makeURL(String s){
		s = s.trim();
		char[] arr = s.toCharArray();
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < arr.length; i++){
			if(arr[i] != ' '){
				str.append(arr[i]);
			} else {
				str.append("%20");
			}
		}
		return str.toString();
	}
	public static void main(String[] args){
		String str = "Mr John Smith    ";
		System.out.println(str);
		System.out.println(makeURL(str));
	}
}