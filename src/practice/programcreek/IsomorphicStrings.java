package practice.programcreek;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	public static boolean isIsomorphic(String str1, String str2) {
		
		if(str1.length() != str2.length())
			return false;
		
		char[] cArr1 = str1.toCharArray();
		char[] cArr2 = str2.toCharArray();
		
		int size = str1.length();
		
		int cntr1 = 0;
		int[] intArr1 = new int[size];
		Map<Character, Integer> map1 = new HashMap<>();
		
		int i = 0;
		for(char c: cArr1) {
			if(map1.containsKey(Character.valueOf(c))) {
				intArr1[i++] = map1.get(Character.valueOf(c)).intValue();
			}else {
				map1.put(Character.valueOf(c), Integer.valueOf(cntr1));
				intArr1[i++] = cntr1++;
			}
		}
		
		int cntr2 = 0;
		int[] intArr2 = new int[size];
		Map<Character, Integer> map2 = new HashMap<>();
		
		i = 0;
		for(char c: cArr2) {
			if(map2.containsKey(Character.valueOf(c))) {
				intArr2[i++] = map2.get(Character.valueOf(c)).intValue();
			}else {
				map2.put(Character.valueOf(c), Integer.valueOf(cntr2));
				intArr2[i++] = cntr2++;
			}
		}
		
		for( i = 0; i < size; i++) {
			if(intArr1[i] != intArr2[i])
				return false;
		}
		
		
		
		return true;
	}

}
