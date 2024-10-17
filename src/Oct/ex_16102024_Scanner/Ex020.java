package Oct.ex_16102024_Scanner;
import java.util.Scanner;
public class Ex020 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter about topic: ");
        String S = a.next();
        System.out.println("Enter 1st no.of pages: ");
        int i1 = a.nextInt();
        System.out.println("Enter 2nd no.of pages: ");
        int i2 = a.nextInt();

        if (i1>i2)
            System.out.println("Greater is : "+ "i1");
        else if (i1<i2)
            System.out.println("Greater is : "+"i2");
        else
            System.out.println("Both Equal");
        a.close();
    }
}
