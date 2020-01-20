class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();   //(Value, index)
        
        for (int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            
            if (map.containsKey(difference)) return new int[] {map.get(difference), i};
            else map.put(nums[i], i);
        }
        return new int[] { -1, -1};
    }
}