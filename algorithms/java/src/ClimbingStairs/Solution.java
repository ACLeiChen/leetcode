package ClimbingStairs;

/**
 * Created by ChenLei on 2016/4/13.
 */
public class Solution {
    private int stairNumber;
    public int numberOfWays = 0;
    public Solution(int n) {
        stairNumber = n;
    }
    public int climbStairs() {
        climbHelper(1, 0, stairNumber);
        climbHelper(2, 0, stairNumber);
        return numberOfWays;
    }

    private int climbHelper (int step, int nowAt, int stairNumber) {
        if ((step + nowAt) == stairNumber) {
            numberOfWays += 1;
        }
        if (step + nowAt < stairNumber) {
            nowAt = step + nowAt;
            climbHelper(1, nowAt, stairNumber);
            climbHelper(2, nowAt, stairNumber);
        }
        return numberOfWays;
    }
    public static void main(String[] args) {
        int result = 0;
        Solution solutionOf3Stairs = new Solution(3);
        result = solutionOf3Stairs.climbStairs();
        System.out.println("3 stairs means 3 ways, and we get: " + result);

        Solution solutionOf4Stairs = new Solution(4);
        result = solutionOf4Stairs.climbStairs();
        System.out.println("4 stairs means 5 ways, and we get: " + result);

        Solution solutionOf5Stairs = new Solution(5);
        result = solutionOf5Stairs.climbStairs();
        System.out.println("5 stairs means 8 ways, and we get: " + result);
    }
}
