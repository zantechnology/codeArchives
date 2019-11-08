package datastructures;

public class Main {

	public static void main(String[] args) {
		testMaxHeap();

	}
	
	
	static void testMaxHeap() {
		MaxHeap<Integer> mh = new MaxHeap<>();
		
		
		mh.insert(3);
		mh.insert(13);
		mh.insert(5);
		mh.insert(4);
		mh.insert(1);
		mh.insert(10);
		mh.insert(15);
		mh.insert(9);
		
		System.out.print("{");
		String delim = "";
		while(!mh.isEmpty()) {
			System.out.print(delim + mh.remove());
			delim = ", ";
		}
		System.out.print("}");
	}
	
	static void testMinHeap() {
		MinHeap<Integer> mh = new MinHeap<>();
		
		
		mh.insert(3);
		mh.insert(13);
		mh.insert(5);
		mh.insert(4);
		mh.insert(1);
		mh.insert(10);
		mh.insert(15);
		mh.insert(9);
		
		System.out.print("{");
		String delim = "";
		while(!mh.isEmpty()) {
			System.out.print(delim + mh.remove());
			delim = ", ";
		}
		System.out.print("}");
	}
	
	

}
