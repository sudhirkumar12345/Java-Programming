// write a program to print area of circle
import java.util.Scanner;
public class AreaOFCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radis ");
        int radius;
        radius=sc.nextInt();
        double pi = 3.14;
        double area = pi*radius*radius;
        System.out.println("the area of circle is :" +area);

    }
}

