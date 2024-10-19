package by.itacademy.arsenialeksandrovich.numbers;

public class Utils {
    public static String getStringFromInt(int num) {
        String number;
        switch (num) {
            case 1:
                number = "Один";
                break;
            case 2:
                number = "Два";
                break;
            case 3:
                number = "Три";
                break;
            case 4:
                number = "Четыре";
                break;
            case 5:
                number = "Пять";
                break;
            case 6:
                number = "Шесть";
                break;
            case 7:
                number = "Семь";
                break;
            case 8:
                number = "Восемь";
                break;
            case 9:
                number = "Девять";
                break;
            default:
                number = "Введена не цифра.";
                break;
        }
        return number;
    }
}
