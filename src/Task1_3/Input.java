package Task1_3;
import java.io.IOException;
/**
 * Created by Lubaya on 26.10.2016.
 * 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
 */
public class Input {
        public static void main(String[] args) throws IOException {
            int quan = 10;

            for (int i = 0; i <= quan; i++) {
                System.out.println((int) (Math.random() * 100));
            }
            for (int i = 0; i <= quan; i++) {
                System.out.print((int) (Math.random() * 100) + " ");
            }
        }
}
