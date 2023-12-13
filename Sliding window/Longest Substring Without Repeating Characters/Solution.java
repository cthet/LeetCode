// Time complexity: O(n)

// Space complexity: O(1)

public class Solution {
  public int lengthOfLongestSubstring(String s) {
    if(s.length()==0||s== null)
        return 0;

    Set set=new HashSet();    
    int l=0;
    int max=0;

    for(int r=0;r<s.length();r++){

        while(!set.add(s.charAt(r)))
            set.remove(s.charAt(l++));

        max = Math.max(max,r-l+1);
    }
    return max;    
  }
}
