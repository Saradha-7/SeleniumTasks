package week2.assignments;

public class TwiceElementTrue {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,4,5,6};
		int len = nums.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i+1; j < len; j++) {
				if (nums[i]==nums[j]) {
					count = count + 1;
					
					
				}
				
			}
			
		}
		//System.out.println(count);
		if (count==0) {
			System.out.println(false);
			
		} else {
			System.out.println(true);

		}

	}

}
