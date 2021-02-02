import java.util.*;

class SingletonInheritanceCheck{
	private static SingletonInheritanceCheck singlton_instance=null;
	public String s;
	private SingletonInheritanceCheck() {
		s="This is String part Singlton class";
	}
	
	public static SingletonInheritanceCheck getInstance() {
		if(singlton_instance==null)
			singlton_instance= new SingletonInheritanceCheck();
		return singlton_instance;
	}
	
}
public class Assignment2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonInheritanceCheck ob1=SingletonInheritanceCheck.getInstance();
		SingletonInheritanceCheck ob2=SingletonInheritanceCheck.getInstance();
		
		System.out.println("String from ob1: "+ob1.s);
		System.out.println("String from ob2: "+ob2.s);

	}

}
