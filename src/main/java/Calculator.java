/**
 * Created by IntelliJ IDEA.<br>
 * User: Alexey<br>
 * Date: 17.03.2018<br>
 * Time: 2:35<br>
 * todo javadoc
 */

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String i = scanner.next();
        String j = scanner.next();
        Float a = Float.parseFloat(i);
        Float b = Float.parseFloat(j);

        System.out.printf("%.4f", a+b);
        scanner.close();

    }
}
