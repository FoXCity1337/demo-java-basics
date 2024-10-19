package by.itacademy.arsenialeksandrovich.numbers;

public class Main {
    public static void main(String[] args) {
        int number;
        String numberAsAString;
        for (int i = 1; i < 10; i++) {
            number = i;
            numberAsAString = Utils.getStringFromInt(number);
            System.out.println(numberAsAString);
        }
    }
}
