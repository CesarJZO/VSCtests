import java.util.Scanner;
/**
 * This is an example of a Java class
 * @author CésarJZO
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO be better than this
        System.out.print("Type a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");

        String[] words = new String[5];

        for (String s : words) {
            s = scanner.next();
            System.out.println(s);
        }
    }
}