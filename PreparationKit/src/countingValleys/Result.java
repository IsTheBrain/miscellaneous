package countingValleys;

public class Result {

    public static int countingValleys(int steps, String path) {
    // Write your code here
    	int lv=0;
    	int valley = 0;
        for(int i = 0; i< steps; i++){
            char step = path.charAt(i);
           if (step == 'U') lv++;
           if (step == 'D') lv--;
           if (step == 'U' && lv == 0) valley++; 
        }
        return valley;
    }
}
