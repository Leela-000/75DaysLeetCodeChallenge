class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        // dp[i] stores the max score difference current player can achieve from i-th stone
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[n] = 0; // base case, no stones left
        
        // iterate from the last stone backwards
        for (int i = n - 1; i >= 0; i--) {
            int currentSum = 0;
            dp[i] = Integer.MIN_VALUE;
            // player can pick 1, 2, or 3 stones
            for (int k = 1; k <= 3 && i + k <= n; k++) {
                currentSum += stoneValue[i + k - 1];
                // current player's score difference = sum of picked stones - opponent's optimal result
                dp[i] = Math.max(dp[i], currentSum - dp[i + k]);
            }
        }
        
        if (dp[0] > 0) return "Alice";    // Alice can secure a positive advantage
        else if (dp[0] < 0) return "Bob"; // Bob wins if Alice cannot get advantage
        else return "Tie";                 // Both end with same score
    }
   
}
