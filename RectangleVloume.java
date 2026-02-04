package method;

package for_loop;
import java.util.Scanner;

class Box {
    double width, height, length;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        width = sc.nextDouble();

        System.out.print("Enter height: ");
        height = sc.nextDouble();

        System.out.print("Enter length: ");
        length = sc.nextDouble();
    }

    double volume() {
        return width * height * length;
    }
}

public class RectangleVloume {
    public static void main(String[] args) {

        Box b1 = new Box();   // object create
        b1.getData();        // input

        double v = b1.volume();   // method call
        System.out.println("Volume of Box = " + v);
    }
}
