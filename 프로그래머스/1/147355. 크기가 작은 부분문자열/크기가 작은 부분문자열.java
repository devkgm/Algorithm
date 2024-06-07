class Solution {
    public int solution(String t, String p) {
        int cnt = 0;
        int plen = p.length();
        for (int i = 0; i <= t.length() - plen; i++) {
            String sub = t.substring(i, i + plen);
            if (Long.parseLong(sub) <= Long.parseLong(p)) {
                cnt++;
            }
        }
        return cnt;
    }
}