/* Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            int l = i+1;
            int r = nums.length - 1;
            while(l<r){
                
                if(nums[i] + nums[l] + nums [r] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    if(!res.contains(temp))
                        res.add(temp);
                   
                    l++;
                    r--;
                }
                else if(nums[i] + nums[l] + nums [r] < 0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return res;
    }
}