package Oct.ex_17102024;

import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter you name" );
        String s = a.next();
        System.out.println("Enter your age");
        int i = a.nextInt();
        System.out.println("Enter your DOB");
        String t = a.next();
      // String St = "17-10-2024";
       // String ST = "18-10-2024";
       String z = "17-10-2024";


        System.out.println();

       if (t==z)
            System.out.println("Today is" +" "+ s +" " + "birthday");
       // else if (t==ST)
           // System.out.println("Mine");

        a.close();

    }
}
