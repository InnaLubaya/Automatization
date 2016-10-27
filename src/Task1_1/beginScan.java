package Task1_1;
import java.util.Scanner;

/**
 * Created by Lubaya on 26.10.2016.
 */
public class beginScan {
    public static void main(String[] args) {
        System.out.println("Введи свое имя Бро и нажми Enter:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет," + name);
        scan.close();
    }
}
