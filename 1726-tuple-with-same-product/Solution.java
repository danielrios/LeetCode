class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                map.put(nums[i]*nums[j], map.getOrDefault(nums[i]*nums[j], 0) + 1);
            }
        }

        int res = 0;
        for (int value : map.values()) {
            if(value > 1)
              res += (value - 1) * value / 2;
        }
        return res * 8;
    }
}