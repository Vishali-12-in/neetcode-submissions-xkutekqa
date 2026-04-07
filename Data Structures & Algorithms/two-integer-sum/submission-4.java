class Solution {
    public int[] twoSum(int[] nums, int target) {
           HashMap<Integer,Integer> twosum=new HashMap<>();
           int[] ans=new int[2];
           for(int i=0;i<nums.length;i++){
                int complement=target-nums[i];

                if(twosum.containsKey(complement)){
                        ans[0]=twosum.get(complement);
                        ans[1]=i;
                }

                twosum.put(nums[i],i);
           }
           return ans;
    }
}
