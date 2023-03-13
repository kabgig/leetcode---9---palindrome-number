class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int temp = x;
        int temp2 = 0;
        while (x != 0) {
            temp2 = temp2 * 10 + (x % 10);
            x /= 10;
        }
        if (temp2 == temp) return true;
        else return false;
    }
}