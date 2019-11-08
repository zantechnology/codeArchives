package algorithms;

import utils.ArrayUtils;

public class Main {

	public static void main(String[] args) {
		testOnlineMedianAlgorithm();

	}
	
	static void testOnlineMedianAlgorithm() {
		OnlineMedianAlgorithm<Integer> oma = new OnlineMedianAlgorithm<>();
		
		oma.insert(3);
		oma.insert(13);
		oma.insert(5);
		oma.insert(4);
		oma.insert(1);
		oma.insert(10);
		oma.insert(15);
		oma.insert(9);
		
		ArrayUtils.printList(oma.getMedian());
		
	}

}
