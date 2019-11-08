package practice.programcreek;

import utils.ArrayUtils;

public class ReverseWordsInString {
	
	public static void reverse(char[] arr) {
		ArrayUtils.flip(arr, 0, arr.length-1);
		int begin = 0;
		int i = 0;
		
		while(i< arr.length) {
			
			if(arr[i] == ' ') {
				ArrayUtils.flip(arr, begin, i - 1);
				begin = i + 1;
			}
			i++;
		}

		ArrayUtils.flip(arr, begin, arr.length - 1);
	}
	
}
