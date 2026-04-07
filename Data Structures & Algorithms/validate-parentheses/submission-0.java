class Solution {
    int i=0;
    public boolean isValid(String s) {
   
        i = 0;
        return check(s, '#') && i == s.length();
    }

    private boolean check(String s, char expected) {
        while (i < s.length()) {
            char c = s.charAt(i++);
            
            if (c == '(') {
                if (!check(s, ')')) return false;
            } else if (c == '[') {
                if (!check(s, ']')) return false;
            } else if (c == '{') {
                if (!check(s, '}')) return false;
            } else {
                return c == expected;
            }
        }
        return expected == '#';
    }
}