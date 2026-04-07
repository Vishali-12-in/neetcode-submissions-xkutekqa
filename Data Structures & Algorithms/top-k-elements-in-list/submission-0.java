class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Here count frequency
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int[] result = new int[k];

        // This find top k elements
        for (int i = 0; i < k; i++) {

            int maxFreq = 0;
            int maxElement = 0;

            // Find element with highest frequency
            for (int key : map.keySet()) {
                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    maxElement = key;
                }
            }

            result[i] = maxElement;

            // Remove so next max can be found
            map.remove(maxElement);
        }

        return result;
    }
}