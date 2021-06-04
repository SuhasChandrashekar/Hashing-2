// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int findMaxLength(int[] nums) {
        int rsum = 0;
        int maxLength = 0;
        Map<Integer,Integer> map = new HashMap<>();
        //to consider the subarray when we encounter the first 0
        map.put(0,-1);
        for(int i = 0;i < nums.length;i++){
            rsum += nums[i] == 1?1:-1;
            if(map.containsKey(rsum)){
                maxLength = Math.max(maxLength,i - map.get(rsum));
            }
            else{
                map.put(rsum,i);
            }
        }
        return maxLength;
    }
}