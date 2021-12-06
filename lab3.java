//задание №2
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class lab3 {
    public static boolean checkPassword(String s) {
        Pattern pattern_pass = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}");
        Matcher matcher_pass = pattern_pass.matcher(s);
        return matcher_pass.matches();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите пароль для проверки:");
        String password = in.nextLine();
        if (checkPassword(password)) {
            System.out.println("пароль является надежным");
        } else {
            System.out.println("пароль не является надежным");
        }
        in.close();
    }
}
