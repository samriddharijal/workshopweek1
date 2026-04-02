package workshop1;

public class qs16 {
    public static void main(String[] args) {

        
        boolean expr1 = (5 > 3);   
        boolean expr2 = (8 > 5);   
        System.out.println("=== Logical AND ===");
        System.out.println("expr1 = (5 > 3) -> " + expr1);
        System.out.println("expr2 = (8 > 5) -> " + expr2);
        System.out.println("expr1 && expr2  -> " + (expr1 && expr2));
        System.out.println();

        
        boolean expr3 = (5 > 3);   
        boolean expr4 = (2 > 5);   
        System.out.println("=== Logical OR ===");
        System.out.println("expr1 = (5 > 3) -> " + expr3);
        System.out.println("expr2 = (2 > 5) -> " + expr4);
        System.out.println("expr1 || expr2  -> " + (expr3 || expr4));
        System.out.println();

       
        boolean expr5 = (!(5 == 10));
        System.out.println("=== Logical NOT ===");
        System.out.println("expr1 = !(5 == 10) -> " + expr5);
        System.out.println();

       
        int x = 5;
        int y = 10;
        System.out.println("=== Comparison Operators (x = " + x + ", y = " + y + ") ===");
        System.out.println("x == y  (Equal to)              -> " + (x == y));
        System.out.println("x != y  (Not equal to)          -> " + (x != y));
        System.out.println("x >  y  (Greater than)          -> " + (x > y));
        System.out.println("x <  y  (Less than)             -> " + (x < y));
        System.out.println("x >= y  (Greater than or equal) -> " + (x >= y));
        System.out.println("x <= y  (Less than or equal)    -> " + (x <= y));
    }
}
