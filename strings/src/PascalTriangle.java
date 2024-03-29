import java.util.ArrayList;
import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rowIndex: ");
        int rowIndex = input.nextInt();
        System.out.print("Values in the row: " + getRow(rowIndex));


    }

    public static ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (rowIndex == 0) {
            temp.add(1);
        } else if (rowIndex == 1) {
            temp.add(1);
            temp.add(1);
        } else {
            temp.add(1);
            temp.add(1);

            for (int i = 2; i <= rowIndex; i++) {
                list.clear();
                list.add(1);
                for (int j = 1; j < i; j++) {
                    list.add(temp.get(j) + temp.get(j - 1));
                }
                list.add(1);
                temp.clear();
                temp = new ArrayList<Integer>(list);

            }
        }
        return temp;
    }
}


                         