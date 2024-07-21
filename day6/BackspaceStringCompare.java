class Solution {
    public String helper(String str){
        Stack<Character> st = new Stack<>();
        for(char i: str.toCharArray()){
            if(i!='#') st.push(i);
            else if(!st.isEmpty()) st.pop();

        }
        return String.valueOf(st);

    }
    public boolean backspaceCompare(String s, String t) {
        return helper(s).equals(helper(t));
    }
}