package by.itacademy.arsenialeksandrovich.pages;

public class HomePage extends BasePage {
    private  String title = "Домашняя страница";
    protected String HOME_URL = BASE_URL + "/" + getTitle();

    public String getTitle() {
        return title;
    }

    @Override
    public void open() {
        System.out.println(HOME_URL);
    }

    public void clickLogin() {
        System.out.println("Пользователь кликнул по кнопке \"Войти\"");
    }
}
