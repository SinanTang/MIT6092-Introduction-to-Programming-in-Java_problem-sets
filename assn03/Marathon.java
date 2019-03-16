
public class Marathon {
	
	public static int bestRunner(String[] runners, int[] times) {
		int fastest = Integer.MAX_VALUE;
		int fIndex = -1;
		
		for (int i = 0; i < times.length; i++) {
			if (times[i] < fastest) {
				fastest = times[i];
				fIndex = i;
			} else {
				continue;
			}
		}
		return fIndex;
	}
	
	public static int getSecondMinIndex(String[] runners,int[] values) {
		int secondIdx = -1;
		int minIdx = bestRunner(runners, values);
		for (int i=0; i<values.length; i++) {
			if (i==minIdx) {
				continue;
				}
			if (secondIdx == -1 || values[i] < values[secondIdx]) {
				secondIdx = i;
			}
		}
		return secondIdx;
	}
	
	public static void main(String[] args) {
//		String[] runners = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
		String[] runners = {"Elena", "Thomas"};
//		int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
		int[] times = {0,0};
		
		System.out.println("Fastest runner:");
		int fIndex = bestRunner(runners, times);
		System.out.println(runners[fIndex] + ". Time: " + times[fIndex]);
		
		int secondIndex = getSecondMinIndex(runners, times);
//		int secondIndex = 0;
//		int secondFast = times[secondIndex];
//	
//		for (int i = 1; i < times.length; i++) {			
//			if (i == fIndex) {
//				continue;
//			} else if (times[i] < secondFast) {
//				secondFast = times[i];
//				secondIndex = i;
//			} else {
//				continue;
//			}
//		}
		System.out.println("Second fastest runner:");
		System.out.println(runners[secondIndex] + ". Time: " + times[secondIndex]);		
	}
}
