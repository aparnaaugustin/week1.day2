package week1.day2;

import java.util.Arrays;
import java.util.Collections;

public class  FindSecondLargest  {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("Second largest Number is : " +data[data.length-2]);
	}

}
