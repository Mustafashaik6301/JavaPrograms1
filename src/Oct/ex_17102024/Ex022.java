package Oct.ex_17102024;
import java.util.Scanner;
public class Ex022 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
       System.out.println("Enter 1st Tri");
       int x = a.nextInt();
        System.out.println("Enter 2nd Tri");
        int y = a.nextInt();
        System.out.println("Enter 3rd Tri");
        int z = a.nextInt();

        if (x==y&&y==z&&z==x)
            System.out.println("Its a :"+ "Equilateral");
        else if (x==y||y==z||x==z)
            System.out.println("Its a :" +"Isosceles");
        else if (x!=y&&x!=z||y!=x&&y!=z&&z!=x&&z!=y)
            System.out.println("Scelene");
        a.close();








    }
}
