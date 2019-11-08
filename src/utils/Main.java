package utils;

public class Main {

	public static void main(String[] args) {
		testFlip();
	}
	
	
	static void testFlip() {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7 ,8};
		ArrayUtils.flip(arr, 1, 3);
		ArrayUtils.printIntArray(arr);
	}

}
