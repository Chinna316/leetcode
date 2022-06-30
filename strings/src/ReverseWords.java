import java.util.Scanner;
public class ReverseWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = input.nextLine();
        String result = reverseWords(s);
        System.out.print("String in reverse order: " + result);
    }
    public static String reverseWords(String s) {
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