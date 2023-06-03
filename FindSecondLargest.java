package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> removeRepeatedNumber = new HashSet<>();
		List<Integer> secondLargeNum = new ArrayList<>();
		for (int i = 0; i < data.length; i++) {
			removeRepeatedNumber.add(data[i]);
			
		}
		secondLargeNum.addAll(removeRepeatedNumber);
		Collections.sort(secondLargeNum);
		int size = secondLargeNum.size();
		System.out.println(secondLargeNum.get(size-2));

	}

}
