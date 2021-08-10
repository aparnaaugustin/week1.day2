package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int add1=	obj.add(3, 4, 5);
		System.out.println("Addition result is : "+add1);
		int sub1=obj.sub(5, 4);
		System.out.println("Subtraction result is : "+sub1);
		double mul1=obj.mul(156.0000, 1.0000);
		System.out.println("Multiplication result is : "+mul1);
		float div1=obj.divide(1.6f, 0.2f);
		System.out.println("Division result is : "+div1);
		
	}

}
