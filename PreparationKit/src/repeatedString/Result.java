package repeatedString;

public class Result {

	/*
	 * Complete the 'repeatedString' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * following parameters: 1. STRING s 2. LONG_INTEGER n
	 */
//There is a string, , of lowercase English letters that is repeated infinitely many times. 
	// Given an integer, , find and print the number of letter a's in the first
	// letters of the infinite string.

	public static long repeatedString(String s, long n) {
		 // Write your code here
		long count = 0;
		long times = (long) (n / s.length());
		for (char character : s.toCharArray()) {
			if (character == 'a')
				count++;
		}
		count = count * times;
		long restCount = (long) (n - (s.length() * times));
		for (int i = 0; i < restCount; i++) {
			if (s.charAt(i) == 'a')
				count++;
		}
		//PROBLEM WITH TIME PROCESSING
		
		//WHY REDO STUFF WITH LOOP IF YOU CAN JUST MULIPTY EVERYTHING
		
		
		
		
//		if (s.length() <= n) {
//			//
//			int times = (int) (n / s.length());
//			for (char character : s.toCharArray()) {
//				if (character == 'a')
//					count++;
//			}
//			count = count * times;
//			long restCount = (long) (n - (s.length() * times));
//			for (int i = 0; i < restCount; i++) {
//				if (s.charAt(i) == 'a')
//					count++;
//			}
//			//
//			while (n != 0) {
//				for (char character : s.toCharArray()) {
//					if (n == 0) {
//						break;
//					}
//					if (character == 'a') {
//						count++;
//					}
//					n--;
//				}
//			}
//		} else {
//			for (int i = 0; i < n; i++) {
//				// char character = s.charAt(i);
//				if (s.charAt(i) == 'a') {
//					count++;
//				}
//			}
//		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(repeatedString("a", 1000000000));
	}
}
