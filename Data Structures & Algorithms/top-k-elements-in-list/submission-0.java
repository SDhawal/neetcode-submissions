class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequency = new HashMap<>();
        for (int num: nums){
            if(frequency.containsKey(num)){
                frequency.put(num, frequency.get(num) + 1);
            }
            else{
                frequency.put(num, 1);
            }
        }
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for(Map.Entry<Integer,Integer> entry : frequency.entrySet()){
                int number = entry.getKey();
                int count = entry.getValue();
                
                if(buckets[count]==null){
                    buckets[count] = new ArrayList<>();
                }

                buckets[count].add(number);
        }

        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {

            if (buckets[i] != null) {

                for (int num : buckets[i]) {

                    result[index] = num;
                    index++;

                    if (index == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
