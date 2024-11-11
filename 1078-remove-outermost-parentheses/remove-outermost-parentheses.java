class Solution {
    public String removeOuterParentheses(String s) {
        String output ="";
        String st ="";
        int count1= 0;
        int count2= 0;

        for(int i=0; i<s.length();i++){
            st += s.charAt(i);
            if (s.charAt(i) == '(') count1++; else count2++;
            if (count1 == count2){    
                output += st.substring(1, count1*2 - 1);
                st = "";
                count1 = 0; count2 = 0;
            }
        }
        return output;     
    }
}
