package Oct.ex_16102024_Conditional_Operator;

public class Ex017 {
    public static void main(String[] args) {
        int a = 0, b = 100, c = 0, d = 101;
        String x = (a>=b||a>=c||a>=d)? "a": (b>=a||b>=c||b>d)? "b" : (c>=d||c>=a||c>d)? "c" : "d";
        System.out.println(x);
    }
}
