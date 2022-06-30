class Solution {
    public String reverseWords(String s) {
        StringBuilder name = new StringBuilder();
        StringBuilder straight = new StringBuilder();
        int i = s.length()-1;
        while(s.charAt(i) == ' ')
            i--;
        for(int j=i; j>=0; j--) {
            if(s.charAt(j)!=' ') {
                name.append(s.charAt(j));
            }
            if((s.charAt(j)==' ' && j!=0 && s.charAt(j-1)!=' ') || j==0) {
                name.reverse();
                straight.append(name);
                if(j!=0)
                    straight.append(s.charAt(j));
                name.delete(0, name.capacity());
            }
        }

        String rev = straight.toString();
        return rev;
    }
}