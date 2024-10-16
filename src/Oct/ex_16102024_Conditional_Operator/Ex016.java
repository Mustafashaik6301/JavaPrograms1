package Oct.ex_16102024_Conditional_Operator;

public class Ex016 {
    public static void main(String[] args) {
        int a =1, b = 2, c = 3;
      int  Str = ((a>b&&a>c)? a : (b>a&&b>c)? b : c);
       System.out.println(Str);
    }
}
