package workshop1;

public class qs4 {
    public static void main(String[] args) {
        double a = 5.0;
        double b = 6.0;
        double c = 7.0;

        double s    = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Side a:         " + a);
        System.out.println("Side b:         " + b);
        System.out.println("Side c:         " + c);
        System.out.println("Semi-perimeter: " + s);
        System.out.println("Area:           " + area);
    }
}
