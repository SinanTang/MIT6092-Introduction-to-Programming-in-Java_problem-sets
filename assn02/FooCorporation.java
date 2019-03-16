
public class FooCorporation {
	public static void calculatePay(int hour, double base) {		
		if (base < 8.0) {
			System.err.println("Error: base pay is lower than $8.00/hour!");
			return;
		}
		
		if (hour > 60) {
			System.err.println("Error: working hours more than 60!");
			return;
		} else if (hour <= 40) {
			double pay = hour * base;
			System.out.println("Total pay: $"+pay);
		} else {
			double pay = 40*base + (hour-40)*base*1.5;
			System.out.println("Total pay: $"+pay);
		}
		
	}
	public static void main(String[] args) {
		calculatePay(35, 7.5);
		calculatePay(47, 8.2);
		calculatePay(73, 10);

	}

}
