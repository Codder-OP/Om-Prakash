import java.util.*;
abstract class NumInput{
	int a;
	int b;
}
abstract class Calculator extends NumInput{
	public abstract void add(int a,int b);
	public abstract void subtract(int a,int b);
	public abstract void multiply(int a,int b);
	public abstract void divide(int a,int b);
	
}
public class Assignment2Q4 extends Calculator {
	@Override
	public void add(int a,int b) {
		System.out.println("Addition: "+(a+b));
	}
	public void subtract(int a,int b) {
		System.out.println("Subtraction: "+(a-b));
	}
	public void multiply(int a,int b) {
		System.out.println("Multiplication: "+(a*b));
	}
	public void divide(int a,int b) {
		System.out.println("Division: "+(a/b));
	}

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Integers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		Calculator cal=new Assignment2Q4();
		cal.add(a,b);
		cal.subtract(a, b);
		cal.multiply(a, b);
		cal.divide(a, b);

	}

}
