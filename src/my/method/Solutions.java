package my.method;

public class Solutions {
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }
    public static int taxEarnings(int earnings){
        return earnings * 6 / 100;

    }
    public static String result(boolean compare, int a, int b){
        String end1 ="Мы советуем вам УСН доходы минус расходы\n" +
        "Ваш налог составит: " + a + "\n" +
        "Налог на другой системе: " + b + "\n" +
        "Экономия: " + (b - a > 0 ? b - a : 0) + " рублей. \n";
        String end2 = "Мы советуем вам УСН доходы\n" +
                "Ваш налог составит: " + b + "\n" +
                "Налог на другой системе: " + a + "\n" +
                "Экономия: " + (a - b > 0 ? a - b : 0) + " рублей. \n";
        if (compare){
            return end1;
        } else {
            return end2;
        }
    }

}
