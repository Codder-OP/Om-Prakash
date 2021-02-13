
import java.util.*;
import java.util.function.Consumer;

public class Assignment4Q8 implements Runnable{
	public static void main(String[] Args) {
		Assignment4Q8 ob = new Assignment4Q8(); 
		List<String> lst = new ArrayList<>();
        lst.add("Ram");
        lst.add("Shyam");
        lst.add("Ghanshyam");
        Thread t1= new Thread(ob);  
        t1.start();   
        ob.print.accept(lst);
	}
	
	Consumer<List<String>> print = list -> {
		for (String s : list)
			 System.out.println(s);
	};

	@Override
	public void run() {
	}
}
