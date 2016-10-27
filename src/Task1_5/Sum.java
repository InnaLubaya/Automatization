package Task1_5;
import java.io.IOException;
/**
 * Created by Lubaya on 26.10.2016.
 * 5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
 */
public class Sum {
    public static void main(String[] args) throws IOException {
        int sum;
        sum = Integer.parseInt(args[0]);
        int mult = Integer.parseInt(args[0]);

        for (int i = 1; i <= args.length - 1; i++) {
            sum += Integer.parseInt(args[i]);
            mult *= Integer.parseInt(args[i]);
        }
        System.out.printf("Сумма  = %d\nПроизведение = %d", sum, mult);
    }
}
