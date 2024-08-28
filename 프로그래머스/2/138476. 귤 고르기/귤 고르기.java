import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Set<Integer> result = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            if(k <= 0) break;
            result.add(entry.getKey());
            k -= entry.getValue();
        }
        return result.size();
    }
}