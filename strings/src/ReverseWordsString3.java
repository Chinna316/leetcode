import java.util.Scanner;
public class ReverseWordsString3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = input.nextLine();
        String result = reverseWords(s);
        System.out.print("Reverse words in string: " + result);
    }
    public static String reverseWords(String s) {
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

