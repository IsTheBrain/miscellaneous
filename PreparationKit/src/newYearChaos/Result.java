package newYearChaos;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class Result {

	/*
	 * Complete the 'minimumBribes' function below.
	 *
	 * The function accepts INTEGER_ARRAY q as parameter.
	 */

	public static void minimumBribes(List<Integer> q) {
		// Write your code here

		int brides = 0;
		int bridedOnce = 0;
		int bridedTwice = 0;
		boolean isBridedOnce;
		boolean isBridedTwice;
		for (int i = q.size() - 1; i > 2; i--) {
			bridedOnce = i - 1;
			bridedTwice = i - 2;
			int ielement = q.get(i);
			int i1element = q.get(i - 1);
			int i2element = q.get(i - 2);

			if (q.get(i) == q.get(i - 1)) {
				brides++;
			} else if (q.get(i) == q.get(i - 2)) {
				brides = brides + 2;
			} else if (q.get(i) == q.get(i - 3)) {
				System.out.println("Too chaotic");
				return;
			}
		}
		if (brides != 0) {
			System.out.println(brides);
		}

		/*
		 * for (int i = 0; i < q.size(); i++) { bridedOnce = i + 2; bridedTwice = i + 3;
		 * isBridedOnce = false; isBridedTwice = false; if (q.get(i) == i + 1) { //
		 * place good } else if (q.get(i) == bridedOnce) { brides++; isBridedOnce =
		 * true; } else if (q.get(i) == bridedTwice) { brides = brides + 2;
		 * isBridedTwice = true; } else if (q.get(i) > bridedTwice) {
		 * System.out.println("Too chaotic"); return; } // SWAP if (isBridedOnce) {
		 * Integer tempElement = q.get(i); q.set(i, bridedOnce); q.set(i + 2,
		 * tempElement); } else if (isBridedTwice) { Integer tempElement = q.get(i);
		 * q.set(i, bridedTwice); q.set(i + 2, tempElement); }
		 * 
		 * }
		 * 
		 * if (brides != 0) { System.out.println(brides); }
		 */
	}

	public static void main(String[] args) {
		List<Integer> q = new ArrayList<Integer>();
		q.add(1);
		q.add(2);
		q.add(5);
		q.add(3);
		q.add(7);
		q.add(8);
		q.add(6);
		q.add(4);
		minimumBribes(q);
	}

	private void solution(List<Integer> q) {
		int count = 0;

		// always keep track of min three vlaues observed
		// Compare currently seeing value with this three values.
		int midOfThree = Integer.MAX_VALUE;
		int maxOfThree = Integer.MAX_VALUE;
		int minOfThree = Integer.MAX_VALUE;

		// iterating from left to right
		for (int i = q.size() - 1; i >= 0; i--) {
			// person has no way to move more than two positions -> wrong
			if ((q.get(i) - i) > 3) {
				System.out.println("Too chaotic");
				return;
			} else {
				// means current value has passed at least 3 values -> wrong
				if (q.get(i) > maxOfThree) {
					System.out.println("Too chaotic");
					return;
				} else if (q.get(i) > midOfThree) { // means -> current value has bribed 2 ppl
					count = count + 2;
				} else if (q.get(i) > minOfThree) { // means-> current value has bribed 1 person.
					count = count + 1;
				}

				// Now adjust minThree values comparing, taking the current vlaue to account
				if (q.get(i) < minOfThree) {
					maxOfThree = midOfThree;
					midOfThree = minOfThree;
					minOfThree = q.get(i);
				} else if (q.get(i) < midOfThree) {
					maxOfThree = midOfThree;
					midOfThree = q.get(i);
				} else if (q.get(i) < maxOfThree) {
					maxOfThree = q.get(i);
				}
			}
		}
		System.out.println(count);

	}
}
