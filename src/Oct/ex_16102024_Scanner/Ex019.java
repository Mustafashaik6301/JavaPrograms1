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

        System.out.println("Name is :" + name);
        System.out.println("Age is:" + i);
        System.out.println("DOB is :" + DOB);

        if (i==24)
            System.out.println("Tomorrow is mine Birthday");
        else
            System.out.println("HM.......");


    }
}
