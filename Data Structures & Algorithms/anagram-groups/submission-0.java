class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> gA = new HashMap<>();

        for (int i=0;i<strs.length;i++){
            char[] letters = strs[i].toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);
            
            if(gA.containsKey(key)){
                gA.get(key).add(strs[i]);
            }
            else{
                gA.put(key, new ArrayList<>());
                gA.get(key).add(strs[i]);
            }
        }
        return new ArrayList<>(gA.values());        
    }
}
