class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int revNum = 0;
        while(x>0){
            int ld = x%10;
            revNum = (revNum*10) + ld;
            x = x/10;
        }
        return revNum == temp;
    }
}
