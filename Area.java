import java.util.*;

public class Area {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int length, width, side1, side2, base, height, radius;
        int choices;
        double a1, a2, a3, a4;
        System.out.println("1 Area of Rectangle");
        System.out.println("2 Area of Square");
        System.out.println("3 Area of Triangle");
        System.out.println("4 Area of Circle");
        System.out.println("---------------------");
        System.out.println("Please choose the area that you want to compute:  ");
        choices = scan.nextInt();

        if (choices == 1) {
            System.out.println("Area of Recatangle");
            System.out.println("Please input length");
            length = scan.nextInt();
            System.out.println("Please input width");
            width = scan.nextInt();
            a1 = (length * width);
            System.out.println("Area of Rectangle is: " + a1);

            a1 = (length * width);
        } else if (choices == 2) {
            System.out.println("Area of Square");
            System.out.println("Please input side1");
            side1 = scan.nextInt();
            System.out.println("Please input side2");
            side2 = scan.nextInt();
            a2 = (side1 * side2);
            System.out.println("Area of Square is: " + a2);
        } else if (choices == 3) {
            System.out.println("Area of Triangle");
            System.out.println("Please input base");
            base = scan.nextInt();
            System.out.println("Please input height");
            height = scan.nextInt();
            a3 = (base * height * 0.5);
            System.out.println("Area of Triangle is: " + a3);
        } else if (choices == 4) {
            System.out.println("Area of Circle");
            System.out.println("Please input radius");
            radius = scan.nextInt();
            a4 = (3.1416 * radius * radius);
            System.out.println("Area of circle is: " + a4);
        } else if (choices > 0) {
            System.out.println("Invalid");
        } else {
        }

    }
}
