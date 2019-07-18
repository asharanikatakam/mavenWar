package javaApp;
public class ReverseWords {

	static String reverseWords(String input1) {
		String str = "";
		String rev = "";
		//insert your code here
		String strs[] = input1.split(" ");
		for (int i = 0; i < strs.length; i++) {
			StringBuffer sb = new StringBuffer(strs[i]);
			rev = sb.reverse().toString().toLowerCase();
			if (i == 0)
				str = rev.substring(0, 1).toUpperCase() + rev.substring(1);
			else
				str = str + " " + rev.substring(0, 1).toUpperCase() + rev.substring(1);
		}
		return str;
	}
	public static void main(String[] args) {
		System.out.println(reverseWords("reverse words program in java built using maven"));
	}
}

