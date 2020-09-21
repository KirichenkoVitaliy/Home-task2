import java.util.Scanner;

public class ValueChange {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = 0;
            c = a;
            a = b;
            b = c;
        System.out.println(a);
        System.out.println(b);
    }


}
