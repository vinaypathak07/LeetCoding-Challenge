class Solution {
    public int numJewelsInStones(String J, String S) {
      int count=0;
        
        HashSet<Character> h= new HashSet<Character>();
        
        for(int i=0;i<J.length();i++)
        {
            h.add(J.charAt(i));
        }
        for(int i=0;i<S.length();i++)
        {
            if(h.contains(S.charAt(i)))
            count++;
        }
        return count;
    }
}
