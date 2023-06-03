package week2.assignments;

import java.util.Arrays;
import java.util.Iterator;

public class MajorityNumber {

	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		int check = 0;
		int count = 0;
		int[] c = new int[6];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					count = count + 1;
				}
				System.out.println(count);
			}
			
			
		}
		



		

	}

}
