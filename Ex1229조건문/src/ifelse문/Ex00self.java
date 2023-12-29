package ifelse문;

public class Ex00self {

	public static void main(String[] args) {
		int largeNumber = 1000000;
		String formattedLargeNumber = String.format("%,d", largeNumber);
		System.out.println("Formatted Large Number: " + formattedLargeNumber);
	}

}
