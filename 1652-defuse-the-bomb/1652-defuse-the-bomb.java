class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            return result;
        }

        int sum = 0;

        if (k > 0) {

            for (int j = 1; j <= k; j++) {
                sum += code[j % n];
            }

            for (int i = 0; i < n; i++) {

                result[i] = sum;

                sum -= code[(i + 1) % n];

                sum += code[(i + k + 1) % n];
            }

        } else {

            for (int j = 1; j <= -k; j++) {
                sum += code[(n - j) % n];
            }

            for (int i = 0; i < n; i++) {

                result[i] = sum;

                sum -= code[(i - (-k) + n) % n];

                sum += code[i];
            }
        }

        return result;
    }
}
