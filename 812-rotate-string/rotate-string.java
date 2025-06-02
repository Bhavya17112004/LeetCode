import java.util.Arrays;
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        else if(s.contains(goal)) return true;
        else {
            s+=s;
            if(s.contains(goal)) return true;
            else return false;
        }
    }
}