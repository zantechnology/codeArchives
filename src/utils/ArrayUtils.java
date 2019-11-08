package utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
	
	
	//lists
	public static <T extends Object> void swap(List<T> list, int i, int j) {
		T ith = list.get(i);
		list.set(i, list.get(j));
		list.set(j, ith);
	}
	
	
	public static <T extends Object> void flip(List<T> list, int i, int j) {
		int steps = (i - j);
		if (steps < 0)
			steps = steps * -1;
		steps= steps/2;
		
		int start = i, end = j;
		if(i > j) {
			start = j; end = i;
		}
		while (start < end){
			swap(list, start++, end--);
		}
	}
	
	public static String listToString(List<?> list) {
		
		String s = "{";
		String delim = "";
		for (Object item:list) {
			s = s + delim + item.toString();
			delim = ", ";
		}
		s = s+ "}";
		return s;
	}
	
	public static String listToString(List<?> list, int b, int e) {
		if (b < 0)
			throw new IndexOutOfBoundsException("b < 0");
		
		if (e >= list.size())
			throw new IndexOutOfBoundsException("e >= array.size()");
		
		if (e < b)
				throw new IndexOutOfBoundsException("e < b");
		
		String s = "{";
		String delim = "";
		for (int i = b; i <= e; i++) {
			s = s + delim + list.get(i).toString();
			delim = ", ";
		}
		s = s+ "}";
		return s;
	}

	
	
	public static void printList(List<?> list) {
		String s = listToString(list);
		System.out.println(s);
	}
	
	public static List<Integer> convert(int[] arr) {
		List<Integer> ret = new ArrayList<Integer>();
		for(int i = 0; i < arr.length;i++) {
			ret.add(arr[i]);
		}
		return ret;
	}
	
	
	//int
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
	}
	
	public static void flip(int[] arr, int i, int j) {
		
		int steps = (i - j);
		if (steps < 0)
			steps = steps * -1;
		steps= steps/2;
		
		int start = i, end = j;
		if(i > j) {
			start = j; end = i;
		}
		while (start < end) {
			swap(arr, start++, end--);
		}
		
		
	}
	
	public static void printIntArray(int[] arr) {
		String s = intArrayToString(arr);
		System.out.println(s);
	}

	
	public static String intArrayToString(int[] arr) {
		
		if (arr == null)
			return "NULL";
		
		String s = "{";
		String delim = "";
		for (int num:arr) {
			s = s + delim + num;
			delim = ", ";
		}
		s = s+ "}";
		return s;
	}
	

	
	public static int[] convert(List<Integer> list) {
		int[] ret = new int[list.size()];
		for(int i = 0; i < list.size();i++) {
			ret[i] = list.get(i).intValue();
		}
		return ret;
	}
	
	//char
		public static void swap(char[] arr, int i, int j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j]= temp;
		}
		
		public static void flip(char[] arr, int i, int j) {
			
			int steps = (i - j);
			if (steps < 0)
				steps = steps * -1;
			steps= steps/2;
			
			int start = i, end = j;
			if(i > j) {
				start = j; end = i;
			}
			while (start < end) {
				swap(arr, start++, end--);
			}
			
			
		}
		
		
		//generic
		public static <T> T[] arrayCopy(T[] original) {

		    //get the class type of the original array we passed in and determine the type, store in arrayType
		    Class<?> arrayType = original.getClass().getComponentType();

		    //declare array, cast to (T[]) that was determined using reflection, use java.lang.reflect to create a new instance of an Array(of arrayType variable, and the same length as the original
		    T[] copy = (T[])java.lang.reflect.Array.newInstance(arrayType, original.length);

		    //Use System and arraycopy to copy the array
		    System.arraycopy(original, 0, copy, 0, original.length);
		    return copy;
		}
		
		public static <T extends Object> void swap(T[] arr, int i, int j) {
			T ith = arr[i];
			arr[i] = arr[j];
			arr[j] =  ith;
		}
	
}
