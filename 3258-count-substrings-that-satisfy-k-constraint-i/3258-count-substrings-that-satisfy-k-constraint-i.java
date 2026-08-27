class Solution {
    public int countKConstraintSubstrings(String s, int k) {

        int left = 0;
        int count0 = 0;
        int count1 = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            if (s.charAt(right) == '0') {
                count0++;
            } else {
                count1++;
            }
            while (count0 > k && count1 > k) {

                if (s.charAt(left) == '0') {
                    count0--;
                } else {
                    count1--;
                }

                left++;
            }
            ans += right - left + 1;
        }

        return ans;
    }
}