import java.util.*;
public class Solution {
   public int[] dailyTemperatures(int[] temperatures) {
       int n = temperatures.length;
       int[] result = new int[n];
       Stack<Integer> stack = new Stack<>(); // stores indices
       // Traverse from right to left
       for (int i = n - 1; i >= 0; i--) {
           // Remove all days that are not warmer than current day
           while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
               stack.pop();
           }
           // If stack is not empty, top is the next warmer day
           if (!stack.isEmpty()) {
               result[i] = stack.peek() - i;
           }
           // Push current day index for future comparisons
           stack.push(i);
       }
       return result;
   }
}