class Solution {
    public int findLucky(int[] arr) {
        int [] freq = new int[arr.length+1];

        for(int num : arr){
            if(num<=arr.length){
                freq[num]++;

            }
        }
         for(int i=arr.length; i>=1; i--){
            if(freq[i]== i){
                return i;

            }
         }
        return -1;   
    }
}