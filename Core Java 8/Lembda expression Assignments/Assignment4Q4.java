import java.util.*;
public class Assignment4Q4 {

	public static ArrayList<String> removeOddLength(ArrayList<String> employeeList){
		Iterator<String> itr=employeeList.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			if(s.length()%2==0) {}
			else {
				itr.remove();
			}
		}
		
		return employeeList;
	}

	public static void main(String[] args) {
		
		ArrayList<String> emp=new ArrayList<String>(Arrays.asList("a","ab","abc","abcd","abcde", "abcdef"));
		ArrayList<String> emp1=removeOddLength(emp);
		System.out.println(emp1);	
	}

}