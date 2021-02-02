import java.util.*;

class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return (salary+incentive);
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return (salary+overtime);
    }
}
public class Assignment2Q2 {
    static int salary = 10000;
    public int getSalary(int salary){
    	return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	int total=0;
    	for(int i=0;i<employeeSalaries.size();i++) {
    		total+=employeeSalaries.get(i);
    	}
    	return total;
    }
    public static void main(String[] args) {
    	Manager manager=new Manager();
    	int manager_sal=manager.getSalary(salary);
    	System.out.println("Employee Salary: "+manager_sal);
    	Labour labour = new Labour();
    	int labour_sal=labour.getSalary(salary);
    	System.out.println("Labour Salary: "+labour_sal);
    	
    	ArrayList<Integer> employeeSalaries=new ArrayList<Integer>();
    	employeeSalaries.add(manager_sal);
    	employeeSalaries.add(labour_sal);
    	
    	Assignment2Q2 ans=new Assignment2Q2();
    	System.out.println("Total Employee Salary: "+ans.totalEmployeesSalary(employeeSalaries));
    	
    	
    }
}