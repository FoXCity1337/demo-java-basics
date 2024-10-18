package by.itacademy.arsenialeksandrovich.numbers;

public class Main {
    public static void main(String[] args) {
        int number = 10;
        String numberAsAString;
        Utils utils = new Utils();
        numberAsAString = utils.getStringFromInt(number);
        System.out.println(numberAsAString);
    }
}
