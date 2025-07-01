/*
 palinfrome number check
 */

 //TODO: need to solve this without converting to string

 class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int start = 0;
        int end = s.length()-1;
        for (int i=0;i<s.length()/2;i++){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}