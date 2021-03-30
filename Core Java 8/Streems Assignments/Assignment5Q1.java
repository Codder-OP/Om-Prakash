import java.util.*;
import java.util.stream.Collectors;

class Fruit {
	private String name;
	private int calories;
	private int price;
	private String color;

	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit name=" + "'" + name + "'" + ", calories=" + calories + ", price=" + price + ", color=" + "'"
				+ color + "'";

	}
}

class Sorting implements Comparator<Fruit> {

	@Override
	public int compare(Fruit a, Fruit b) {
		if (a.getPrice() < b.getPrice())
			return 1;
		else
			return -1;
	}
}

public class Assignment5Q1 {
	public static ArrayList<Fruit> sort(ArrayList<Fruit> Fruits) {

		ArrayList<Fruit> sortedorder;
		List<Fruit> calFruits = Fruits.stream().sorted((f1, f2) -> f1.getColor().compareTo(f2.getColor()))
				.collect(Collectors.toList());
		sortedorder = new ArrayList<>(calFruits);
		return sortedorder;
	}

	public static ArrayList<Fruit> lowCaloryFruits(ArrayList<Fruit> fruits) {
		ArrayList<Fruit> fs = new ArrayList<>();
		fs = (ArrayList<Fruit>) fruits.stream().filter(i -> i.getCalories() < 100)
				.sorted((f1, f2) -> f2.getCalories() - f1.getCalories()).collect(Collectors.toList());
		fs.stream().sorted();
		return fs;
	}

	public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits) {
		ArrayList<Fruit> redFruits;
		List<Fruit> tf = fruits.stream().filter(i -> i.getColor().equalsIgnoreCase("Red"))
				.sorted((f1, f2) -> f1.getPrice() - f2.getPrice()).collect(Collectors.toList());
		redFruits = new ArrayList<>(tf);
		return redFruits;
	}

	public static void main(String[] args) {
		Fruit f1 = new Fruit("Banana", 95, 50, "Yellow");
		Fruit f2 = new Fruit("Kiwi", 100, 120, "Green");
		Fruit f3 = new Fruit("WaterMelon", 120, 40, "Red");
		Fruit f4 = new Fruit("Cheery", 180, 150, "Red");
		Fruit f5 = new Fruit("Orange", 50, 60, "Orange");
		Fruit f6 = new Fruit("Apple", 60, 90, "Red");

		ArrayList<Fruit> myFruits = new ArrayList<Fruit>();
		myFruits.add(f1);
		myFruits.add(f2);
		myFruits.add(f3);
		myFruits.add(f4);
		myFruits.add(f5);
		myFruits.add(f6);

		System.out.println("Low Calories Fruits less than 100 in descending order:");
		ArrayList<Fruit> fs = lowCaloryFruits(myFruits);
		fs.stream().forEach(i -> System.out.println(i));

		System.out.println();

		System.out.println("Sorted According to color: ");
		ArrayList<Fruit> fs1 = sort(myFruits);
		fs1.stream().forEach(i -> System.out.println(i));

		System.out.println();

		System.out.println("Sorted According to Price and Colour:");
		ArrayList<Fruit> fs2 = filterRedSortPrice(myFruits);
		fs2.stream().forEach(i -> System.out.println(i));
		System.out.println();
	}
}