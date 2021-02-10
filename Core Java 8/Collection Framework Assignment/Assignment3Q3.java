import java.util.*;

public class Assignment3Q3 {
	public static List traverseReverse(ArrayList lst) {
		List list = new ArrayList();

		ListIterator itr = lst.listIterator(lst.size());
		while (itr.hasPrevious()) {
			list.add(itr.previous());
		}
		return list;


	}

	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList<Integer>();

		ls.add(5);
		ls.add(10);
		ls.add(15);
		ls.add(20);
		ls.add(25);
		List ls1=traverseReverse(ls);
		System.out.println(ls1);

	}
}
