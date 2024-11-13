import java.util.*;
class Solution {
    public int majorityElement(int[] v) {
        int n = v.length, count =0, ele=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count =1; ele =v[i];
            } else if(ele==v[i]) count++;
            else count --;
        }

        int c=0;
        for(int i=0;i<n;i++){
            if(v[i] == ele) c++;
        }
        if(c> n/2) return ele;
        else return -1;

    }
}