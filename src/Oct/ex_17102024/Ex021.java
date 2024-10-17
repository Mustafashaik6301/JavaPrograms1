package Oct.ex_17102024;

import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
         System.out.println("Enter you score : ");
         int  i = a.nextInt();

         if (i>=90&&i<=100)
             System.out.println("Your grade is : "+'A');
         else if (i>=80&&i<=89)
             System.out.println("your grade is : "+'B');
         else if (i>=70&&i<=79)
             System.out.println("your grade is : "+'C');
         else if (i>=60&&i<=69)
             System.out.println("your grade is : "+'D');
         else if (i>100)
             System.out.println("your grade is : "+"Invalid");
         else
             System.out.println("your grade is : "+ 'F');


            a.close();
    }

}
