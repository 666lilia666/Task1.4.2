/*
Вывод программы основан на следующих расчётах:

Доходы ИП: 400 + 600 = 1000 рублей
Расходы ИП: 100 рублей
УСН доходы: 6% от 1000 рублей = 60 рублей
УСН доходы минус расходы: 15% от 1000-100 рублей = 135 рублей
Экономия: 135 - 60 = 75 рублей
*/

import java.util.*;
import my.method.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int earnings = 0;    // доходы
        int spendings = 0;   // расходы
        int a = Solutions.taxEarningsMinusSpendings(earnings, spendings);
        //int b = Solutions.taxEarnings(earnings);
        //boolean c = Solutions.compare(a, b);
        String menu = "Выберите операцию и введите её номер:\n" +
                "1. Добавить новый доход\n" +
                "2. Добавить новый расход\n" +
                "3. Выбрать ситему налогооблажения\n";
        while (true){

            System.out.println(menu);
            String input = scan.nextLine();
            if ("end".equals(input)) {
                break;
            } else {
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        System.out.println("Введите сумму дохода:");
                        String moneyStrIn = scan.nextLine(); // Не используйте тут nextInt (!)
                        int moneyIn = Integer.parseInt(moneyStrIn);
                        earnings += moneyIn;
                        break;
                    case 2:
                        System.out.println("Введите сумму расхода:");
                        String moneyStrOut = scan.nextLine(); // Не используйте тут nextInt (!)
                        int moneyOut = Integer.parseInt(moneyStrOut);
                        spendings += moneyOut;
                        break;
                    case 3:
                        //System.out.println(Solutions.result(c, a, b));
                        break;
                    default:
                        System.out.println("Такой операции нет");
                }
            }

        }

    }
}
