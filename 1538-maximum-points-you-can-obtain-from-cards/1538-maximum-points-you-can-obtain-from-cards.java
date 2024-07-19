class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int n = cardPoints.length;
       int l = 0;
       int r = k-1;
       int sum = 0;
       int Maxsum = 0;
       for(int i = l;i<=r;i++){
        sum = sum+cardPoints[i];
        Maxsum = Math.max(Maxsum,sum);
       }
       int right = n-1;
       for(int i = k-1;i>=0;i--){
        sum = sum - cardPoints[i];
        sum = sum + cardPoints[right];
        Maxsum = Math.max(Maxsum,sum);
        right--;
       }
       return Maxsum;
    }
}