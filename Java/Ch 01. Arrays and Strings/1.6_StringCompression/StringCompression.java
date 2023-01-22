import java.util.*;

public class StringCompression {
	private static String CompressString (String str){
		StringBuilder ret = new StringBuilder();
		int count = 0;
		char c;
		if(str.length() == 1) return str;
		for(int i = 0; i < str.length(); i++){
			count++;
			c = str.charAt(i);
			if(i+1 < str.length() && str.charAt(i) != str.charAt(i+1)){
				ret.append("" + c + count);
				count = 0;
			}
			if(i+1 == str.length()){
				if(str.charAt(i) == str.charAt(i-1)){
					ret.append("" + c + count);
				}
				else
				{
					ret.append("" + c + "1");
				}
			}
		}
		String x = ret.toString();
		if(x.length() > str.length()) return str;
		return ret.toString();
	}
	public static void main(String[] args){
		String str = "aaa";
		System.out.println(str);
		System.out.println(CompressString(str));
		str = "aaab";
		System.out.println(str);
		System.out.println(CompressString(str));
		str = "aaaaaabbbcdddddd";
		System.out.println(str);
		System.out.println(CompressString(str));
		str = "a";
		System.out.println(str);
		System.out.println(CompressString(str));
	}
}