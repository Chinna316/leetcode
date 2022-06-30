/*
*  - step1
*
* */
import java.util.*;
import java.util.Scanner;
public class StrStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String haystack = input.nextLine();
        String needle = input.nextLine();
        System.out.print(strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
            int index = 0;
            if(needle.length() == 0)
                return index;
            else if (haystack.indexOf(needle) != -1) {
                index = haystack.indexOf(needle);
                return index;
            }
            else
                return -1;
        }
    }
