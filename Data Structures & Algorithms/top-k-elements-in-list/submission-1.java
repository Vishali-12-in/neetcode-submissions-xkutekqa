class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int maxFreq = 0;
            int maxElement = 0;
            for (int key : map.keySet()) {
                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    maxElement = key;
                }
            }
            result[i] = maxElement;
            map.remove(maxElement);
        }

        return result;
    }
}