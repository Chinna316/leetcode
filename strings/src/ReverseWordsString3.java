class ReverseWordsString3 {
    public String reverseWords(String s) {
        StringBuilder name = new StringBuilder();
        StringBuilder straight = new StringBuilder();
        for(int i = 0; i<s.length(); i++) {

            if(s.charAt(i) != ' ')
                name.append(s.charAt(i));
            if(s.charAt(i) == ' ' || i == s.length()-1) {
                name.reverse();

                straight.append(name);
                if(i != s.length()-1)
                    straight.append(s.charAt(i));
                name.delete(0, name.capacity());
            }
        }
        String rev = straight.toString();
        return rev;
    }

}

