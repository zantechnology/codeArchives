package practice.programcreek;

import java.util.ArrayList;
import java.util.List;
import sorts.SimpleSort;

public class Sum3 {
	public static List<List<Integer>> getSum3(int[] arr, int target) throws Exception {

		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		if(arr == null || arr.length < 3)
			throw new Exception("Input array must contain at least 3 elements");
		
		
		int[] workingArr = SimpleSort.sort(arr, true);
		
		for(int i = 0; i < workingArr.length; i++) {
			if (i > 0 && workingArr[i] == workingArr[i - 1]) {
				continue;
			}
			int j = i + 1;
			int k = workingArr.length - 1;
			while (j < k) {
				if (k < workingArr.length - 1 && workingArr[k] == workingArr[k + 1]) {
					k--;
					continue;
				}
				
				int sum = workingArr[i] + workingArr[j] + workingArr[k];
				
				if(sum == target) {
					List<Integer> tripple = new ArrayList<Integer>();
					tripple.add(workingArr[i]);
					tripple.add(workingArr[j]);
					tripple.add(workingArr[k]);
					res.add(tripple);
					j++;
	                k--;
					
				}else if(sum > target) {
					k--;
				}else {
					j++;
				}
			}
		}
		
		return res;
		
	}
}
