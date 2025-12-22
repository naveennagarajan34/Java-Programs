package collections;

import java.util.List;
import java.util.ArrayList;

public class ArrayList_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> id = new ArrayList<Integer>();
		id.add(10);
		id.add(20);
		id.add(40);
		id.add(30);
		id.add(3, 50);

		id.get(0);
		id.remove(Integer.valueOf(30));

		id.add(2, 30);
		id.set(0, 15);

		System.out.println(id.get(id.size() - 1)); // last element

		System.out.println(id);

		id.forEach(e -> System.out.println(e));

	}

}
