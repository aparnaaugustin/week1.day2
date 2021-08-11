package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		char[] arr=str.toCharArray();
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (str.charAt(i)=='e') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
