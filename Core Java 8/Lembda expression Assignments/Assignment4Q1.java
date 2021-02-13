import java.util.*;

interface Calculator {
	double cal(int x, int y);
}

public class Assignment4Q1 {
	Calculator add = (a, b) -> a + b;
	Calculator sub = (a, b) -> a - b;
	Calculator mul = (a, b) -> a * b;
	Calculator div = (a, b) -> (double)a / b;

	public double addition(int num1, int num2) {
		return add.cal(num1,num2);
	}

	public double subtraction(int num1, int num2) {
		return sub.cal(num1,num2);
	}

	public double multiplication(int num1, int num2) {
		return mul.cal(num1,num2);
	}

	public double division(int num1, int num2) {
		return div.cal(num1,num2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Assignment4Q1 ob=new Assignment4Q1();
		System.out.println(ob.addition(a, b));
		System.out.println(ob.subtraction(a, b));
		System.out.println(ob.multiplication(a, b));
		System.out.println(ob.division(a, b));
		sc.close();

	}
}
