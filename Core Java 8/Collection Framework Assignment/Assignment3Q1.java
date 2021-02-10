import java.util.*;

class Person{
    private String name;
    private int height;
    private double weight;
    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    
    public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	
	public double getWeight() {
		return weight;
	}
}
class Sort implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		if (p1.getWeight() > p2.getWeight())
			return 1;
		else if (p1.getWeight() == p2.getWeight()) {
			if (p1.getHeight() > p2.getHeight())
				return 1;
			else 
				return -1;
		}

		return -1;

	}
}

public class Assignment3Q1 {

	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<Person>(new Sort());
		ts.add(new Person("Ram", 162, 62.5));
		ts.add(new Person("Shyam", 165, 64.0));
		ts.add(new Person("Ghanshyam", 170, 58.9));
		ts.add(new Person("Om", 166, 58.9));
		ts.add(new Person("Ajay", 174, 74.1));
		ts.add(new Person("Ramu", 160, 55.5));
		
		for (Person i : ts) {
			System.out.println(i.getName() +", "+ i.getHeight() +", "+ i.getWeight());
		}
	}

}
