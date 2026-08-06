class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int left = 0;

        for (int right = 0; right <= arr.length; right++) {
            if (right == arr.length || arr[right] == ' ') {
                reverse(arr, left, right - 1);
                left = right + 1;
            }
        }

        return new String(arr);
    }

    private void reverse(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
   