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
        Double a = Double.parseDouble(i);
        Double b = Double.parseDouble(j);

        System.out.println(a+b);
        scanner.close();

    }
}
