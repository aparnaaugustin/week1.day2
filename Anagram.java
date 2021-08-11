package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss"; 
		int length1=text1.length();
		int length2=text2.length();
		if(length1==length2)
		{
			char[]arr1=text1.toCharArray();
			char[]arr2=text2.toCharArray();
			Arrays.sort(arr1);
			System.out.println(arr1);
			Arrays.sort(arr2);
			System.out.println(arr2);
			if (Arrays.equals(arr1, arr2)) {
				System.out.println("Anagrams");
			}
		}
			else
			{
				System.out.println("Not Anagrams");
			}
		
	}

}
