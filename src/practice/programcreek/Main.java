package practice.programcreek;

import java.util.List;

import practice.programcreek.RotateArray;
import utils.ArrayUtils;

public class Main {

	public static void main(String[] args) {
		testSum3();
	}
	
	static void testRotateArray() {
		int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
		RotateArray.simpleRotate(arr1, 2, false);
		ArrayUtils.printIntArray(arr1);
		
		
		int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7};
		RotateArray.efficientRotate(arr2, 2, false);
		ArrayUtils.printIntArray(arr2);
	}
	
	static void testReverseWordsInString() {
		
		char[] arr = "this is a test".toCharArray();
		ReverseWordsInString.reverse(arr);
		System.out.println(new String(arr));
		
	}
	
	static void testReversePolishNotation() {
		
		String[] expr = "3 5 8 3 1 - / + *".split(" ");
		int result = ReversePolishNotation.evaluate(expr);
		System.out.println(result);
		
	}
	
	static void testIsomorphicStrings() {
		
		String str1 = "qwertyuiqqww";
		String str2 = "asdfghjkaass";
		System.out.println(IsomorphicStrings.isIsomorphic(str1, str2));
		
	}
	
	public static void testMedianOfTwoSortedArrays() {
		
		int[] arr1 = new int[] {1 , 6};
		int[] arr2 = new int[] {2, 3, 5, 23};
		double res = 0.0;
		try {
			res = MedianOfTwoSortedArrays.findMedian(arr1, arr2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(res);
	}
	
	public static void testKthLargestElement() {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int res = 0;
		try {
			res = KthLargestElement.findKthLargestElement(arr, 4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(res);
	}
	
	public static void testTwoSum() {
		int[] arr = new int[] {110, 100, 90, -20, 10};
		try {
			int[] res = TwoSum.getTwoSum(arr, -10);
			ArrayUtils.printIntArray(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void testTwoSumSorted() {
		int[] arr = new int[] {100, 200, 301, 400, 501, 600};
		try {
			int[] res = TwoSumSorted.getTwoSum(arr, 300);
			ArrayUtils.printIntArray(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void testSum3() {
		int[] arr = new int[] {101, 202, 303, 51, 42, 513};
		try {
			List<List<Integer>> res = Sum3.getSum3(arr, 606);
			for(List<Integer> r : res)
				ArrayUtils.printList(r);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
