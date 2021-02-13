import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Assignment3Q8b {
	public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list) {

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			list.add(25);
		}
		return list;
	}

	public static void main(String args[]) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);

		failFast(list);
	}
}