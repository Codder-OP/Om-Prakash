import java.util.*;

class Employee {
    private String name;
    private int id;
    
    
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		return 20;
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
    
}

public class Assignment3Q5 {
    public static void main(String[] args) {
    	Map<Employee,String> mp = new HashMap<>();
		Employee e1 = new Employee("Employee1",1);  
	    Employee e2 = new Employee("Employee2",2); 
		mp.put(e1, e1.getName());
		mp.put(e2, e2.getName());
		
       System.out.println(mp.get(e1)); 
 
       System.out.println(mp.get(e2));
       
       Employee e3 = new Employee("Employee3",3);
       mp.put(e3, e3.getName());
       e3.setName("asdf");
       System.out.println(mp.get(e3));

    }
}
