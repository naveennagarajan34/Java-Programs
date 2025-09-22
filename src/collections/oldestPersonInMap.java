package collections;

import java.util.HashMap;
import java.util.Map;

public class oldestPersonInMap {
	
//	Most common Map methods are below
//		size() → total entries
//		containsKey() / containsValue() → checking presence
//		getOrDefault() → safe lookup with default
//		remove() → delete an entry
//		keySet() → loop through keys
//		entrySet() → loop through key + value together
//		values() → get only values
//		clear() / isEmpty() → clean and check emptiness

	public static void main(String[] args) {
		Map<String, Integer> employees = new HashMap<>();
		employees.put("Amit", 34);
		employees.put("Sumit", 26);
		employees.put("Naveen", 24);
		employees.put("Ravi", 41);
		employees.put("Priya", 29);
		employees.put("Sneha", 32);
		employees.put("Karan", 38);
		employees.put("Meena", 27);
		employees.put("Vikram", 36);
		employees.put("Anita", 30);

		int older = 0;
		String olderPerson = "";
		if(employees.containsKey("Naveen")) {
			System.out.println("Yes we have the employee Naveen in our list");
		}
		if(employees.containsValue(26)) {
			System.out.println("Yes we have a employee with age 26");
		}
		if(employees.containsKey("Meena")) {
			employees.remove("Meena");
			System.out.println("Employee Meena removed from the list");
		}
		for (Map.Entry<String, Integer> entry : employees.entrySet()) {
			if (entry.getValue() > older) {
				older = entry.getValue();
				olderPerson = entry.getKey();
			}
		}
		System.out.println("Oldest Employee in the Employee list is --> " + olderPerson);
	}
}
