package by.itacademy.arsenialeksandrovich.pages;

public class BasePage {
    protected String BASE_URL = "BASE_URL";

    public void open() {
        System.out.println("Пользователь открыл страницу " + BASE_URL);
    }
}
