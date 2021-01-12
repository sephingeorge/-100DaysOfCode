

public class Solution1 {

	public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int i =0;
        for(int j=1; j<len; j++){
            if(nums[i] != nums[j]){
                
                if(i<j){
                    nums[++i]= nums[j];
                }
            }
            
        }
        return ++i;
        
    }
	
	public static void main(String args[]) {
		int[] nums = {1,2};
		int len = removeDuplicates(nums);
		for(int i = 0; i<len; i++) {
			System.out.println(nums[i]);
		}
	}
}
