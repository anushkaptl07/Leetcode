class Solution {

    // Function to calculate the digit sum of a number
    private int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;  // take last digit
            n /= 10;        // remove last digit
        }
        return sum;
    }

    public int countEven(int num) {

        // Step 1: find digit sum of the last number (num)
        int sum = digitSum(num);

        // Step 2: Apply formula
        // If digit sum is even → answer = num / 2
        // If digit sum is odd  → answer = (num - 1) / 2
        if (sum % 2 == 0) {
            return num / 2;
        } else {
            return (num - 1) / 2;
        }
    }
}