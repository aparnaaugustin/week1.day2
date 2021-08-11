package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] arr=test.toCharArray();
		for (int j = 0; j < arr.length; j++) {
			if (Character.isLetter(arr[j])) {
				letter++;
			}



			else if (Character.isDigit(arr[j])) {
				num++;
			}



			else if (Character.isSpace(arr[j])) {
				space++;
			}
			else
			{
				
				specialChar++;
		}



	}
	System.out.println("Letters:" +letter);	
	System.out.println("Digits:" +num);	
	System.out.println("Spaces:" +space);	
	System.out.println("Special Character:" +specialChar);	

}

}
