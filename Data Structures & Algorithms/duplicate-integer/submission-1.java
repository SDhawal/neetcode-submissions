

class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> distinct = new HashSet<Integer>();
        for (int i = 0; i<n; i++){
            if (distinct.contains(nums[i])){
                return true;
            }else{
                distinct.add(nums[i]);
            }
        }
        return false;
    }
}