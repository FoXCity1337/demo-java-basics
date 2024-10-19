package by.itacademy.arsenialeksandrovich.pages;

public class BasePage {
    protected String BASE_URL = "BASE_URL";

    public String getBASE_URL() {
        return BASE_URL;
    }

    public void open() {
        System.out.println("Пользователь открыл страницу " + getBASE_URL());
    }
}
