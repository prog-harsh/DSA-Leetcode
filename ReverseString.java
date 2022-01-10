// Leetcode ques 344. Reverse String

/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.
*/
class Solution {

    void reverse(int i, int j, char[] s){
        if(i >= j){
            return;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        i++;
        j--;
        reverse(i, j, s);
    }
    public void reverseString(char[] s) {


        reverse(0,s.length - 1, s);
    }
}