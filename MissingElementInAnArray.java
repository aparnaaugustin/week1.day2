package week1.day2;

public class MissingElementInAnArray  {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
		}
	}

}
