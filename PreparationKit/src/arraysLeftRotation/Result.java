package arraysLeftRotation;

import java.util.ArrayList;
import java.util.List;

public class Result {

	public static List<Integer> rotLeft(List<Integer> a, int d) {
		// Write your code here
		//Integer element = null;

		int size = a.size();
		int rest = (d % size);
		if (rest == 0) {
			return a;
		}
		for (int i = 0; i < rest; i++) {
			a.add(a.get(0));
			a.remove(0);
			
		}
/*		int rest = (d % size);
		if (rest == 0) {
			return a;
		}
		for (int i = 0; i < rest; i++) {
			element = a.get(0);

			for (int j = 0; j < a.size(); j++) {
				if (j == a.size() - 1) {
					a.set(j, element);
				} else {
					a.set(j, a.get(j + 1));
				}
			}
		}
		*/
		/*
		 * while (count < d) { // save first element if (index == 0 || index ==
		 * a.size()) { }
		 * 
		 * // swap if (index == a.size() - 1) { a.set(index, element); index = 0; } else
		 * { a.set(index, a.get(index) + 1); } count++; index++; }
		 */
		return a;
	}

	public static void main(String[] args) {
		ArrayList<Integer> name = new ArrayList<Integer>();
		name.add(1);
		name.add(2);
		name.add(3);
		name.add(4);
		name.add(5);
		System.out.println(rotLeft(name, 6));
	}
}
