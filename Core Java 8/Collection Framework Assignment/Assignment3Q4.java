import java.util.*;

class DateClass {
	private int date;
	private int month;
	private int year;

	public DateClass(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(date, month);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DateClass other = (DateClass) obj;
		return date == other.date && month == other.month;
	}
}

public class Assignment3Q4 {

	public String getEmployee(HashMap<DateClass, String> dob, String employeeName) {
		Set<Map.Entry<DateClass, String>> empEntry = dob.entrySet();
		for (Map.Entry<DateClass, String> emp : empEntry) {
			if (emp.getValue().equals(employeeName)) {
				return employeeName;
			}
		}
		return "get Method failed!!";
	}

	public static void main(String[] args) {

		HashMap<DateClass, String> hashMap = new HashMap<>();

		DateClass d0 = new DateClass(14, 03, 1997);
		DateClass d1 = new DateClass(07,07, 1999);
		DateClass d2 = new DateClass(07, 07, 1998);
		
		hashMap.put(d0, "Om");
		hashMap.put(d1, "Ram");
		hashMap.put(d2, "Shyam");
		
		Assignment3Q4 assign = new Assignment3Q4();
		System.out.println(assign.getEmployee(hashMap, "Om"));
		System.out.println(assign.getEmployee(hashMap, "Ram"));
		System.out.println(assign.getEmployee(hashMap, "Shyam"));

	}
}