package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		Map<String, String> dataStructures = new HashMap<>();
		dataStructures.put(new String("[ ]"), "array1");
		dataStructures.put(new String("[ ]"), "array2");
		System.out.println(dataStructures);


		List<String> listA = new ArrayList<>();
		listA.add("A");

		List<String> listB = listA;
		List<String> listC = new ArrayList<>(listB);
		listA.clear();
		listB.add("B");
		listC.add("C");
		

		System.out.println(listA);
		System.out.println(listB);
		System.out.println(listC);
	}
}
