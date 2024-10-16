package Oct.ex_16102024_Scanner;

import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter Digits:");
        int digits = a.nextInt();

        System.out.print("Enter Name");
        String S = a.nextLine();

        System.out.print("Enter Salary");
        float f = a.nextFloat();
        System.out.println(digits+","+S+","+f);
        a.close();

    }

}
