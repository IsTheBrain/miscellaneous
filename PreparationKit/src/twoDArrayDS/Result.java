package twoDArrayDS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result {

	/*
	 * Complete the 'hourglassSum' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY arr as parameter.
	 */

	public static int hourglassSum(List<List<Integer>> arr) {
		// Write your code here
		List<Integer> sum = new ArrayList<Integer>();
		// int tempSum = 0;
		// Take the center
		// sum the element on the border
		for (int i = 1; i < arr.size() - 1; i++) {

			List<Integer> column = arr.get(i);
			for (int j = 1; j < column.size() - 1; j++) {
				int tempSum = 0;

				// first line

				tempSum += arr.get(i - 1).get(j - 1);
				tempSum += arr.get(i - 1).get(j);
				tempSum += arr.get(i - 1).get(j + 1);
				// center
				tempSum += arr.get(i).get(j);
				// second line
				tempSum += arr.get(i + 1).get(j - 1);
				tempSum += arr.get(i + 1).get(j);
				tempSum += arr.get(i + 1).get(j + 1);
				sum.add(tempSum);
			}
		}

		int maxSum = sum.get(0);
		for (int i = 1; i < sum.size(); i++) {
			if (maxSum < sum.get(i)) {
				maxSum = sum.get(i);
			}
		}
		// other possibility to remove the last iteration
		Collections.max(sum);
		//

		return maxSum;
	}

	// Solution proposed by utente sul web
	// private void voi(List<List<Integer>> arr) {
	// TODO Auto-generated method stub
	//
	// List sum = new ArrayList();
	// sum.toArray(new Integer[sum.size()];
	// for(int i=0; i<4; i++){
	/*
	 * for(int j=0; j<4; j++){
	 * sum.add(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][
	 * j+1]+arr[i+2][j+2]); } }
	 */
	// System.out.println(Collections.max(sum)); }
	//
//}
}
