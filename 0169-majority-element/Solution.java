class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, majority = 0;
        for(int n:nums) {
            if(count == 0) {
                majority = n;
            }

            count += n == majority ? 1 : -1;
        }
        return majority;
    }
}