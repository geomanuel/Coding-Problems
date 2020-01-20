class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> map = new HashMap<String, List>();
        
        for (String str : strs){
            char[] characters = str.toCharArray();
            Arrays.sort(characters);
            String sortedString = String.valueOf(characters);
            
            if (!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<String>());
            }
            map.get(sortedString).add(str);
        }
        
        return new ArrayList(map.values());
        
    }
}