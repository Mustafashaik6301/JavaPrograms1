package Oct.ex_16102024_Scanner;

import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = a.next();
        System.out.print("Enter age: ");
        int i = a.nextInt();
        System.out.print("Enter DOB: ");
        String DOB = a.next();
        String st = "17-10-2024";

        System.out.println("Name is :" + name);
        System.out.println("Age is:" + i);
        System.out.println("DOB is :" + DOB);

        if (DOB==st)
            System.out.println("Today is mine Birthday");
        else
            System.out.println("HM.......");

            a.close();
    }
}
