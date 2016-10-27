package Task1_4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lubaya on 26.10.2016.
 * 4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
 */
public class Password {
    public static void main(String[] args) throws IOException {
        System.out.println("Введи пароль Бро");
        String passw = "123456";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (!reader.readLine().equals(passw)) {
            System.out.println(";( Не правильно Бро!!!");
        }
        System.out.println(";) Все верно, твой пароль: "+passw);

    }
}
