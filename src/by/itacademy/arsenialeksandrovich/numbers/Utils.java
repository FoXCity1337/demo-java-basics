package by.itacademy.arsenialeksandrovich.numbers;

public class Utils {
    public String getStringFromInt(int num) {
        return switch (num) {
            case 1 -> "один";
            case 2 -> "два";
            case 3 -> "три";
            case 4 -> "четыре";
            case 5 -> "пять";
            case 6 -> "шесть";
            case 7 -> "семь";
            case 8 -> "восемь";
            case 9 -> "девять";
            default -> "";
        };
    }
}
