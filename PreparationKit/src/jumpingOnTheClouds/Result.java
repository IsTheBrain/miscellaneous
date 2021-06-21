package jumpingOnTheClouds;

import java.util.ArrayList;
import java.util.List;

public class Result {

	public static int jumpingOnClouds(List<Integer> c) {
		// Write your code here
		int jump = 0;
		int i = 0;

		while (i < c.size() - 1) {
			// last mandatory jump
			if (i == c.size() - 2) {
				jump++;
				break;
			}

			if (c.get(i + 2) == 0) {
				i = i + 1;
			}
			jump++;
			i = i + 1;
		}

		return jump;
	}

	public static void main(String[] args) {
		List<Integer> c = new ArrayList<Integer>();
		// 0 0 0 1 0 0
		// 0 0 1 0 0 1 0
		c.add(0);
		c.add(0);
		c.add(1);
		c.add(0);
		c.add(0);
		c.add(1);
		c.add(0);
		System.out.println(jumpingOnClouds(c));
	}
}
