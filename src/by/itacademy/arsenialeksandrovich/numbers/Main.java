package by.itacademy.arsenialeksandrovich.numbers;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            String numberAsAString = Utils.getStringFromInt(i);
            System.out.println(numberAsAString);
        }
    }
}
