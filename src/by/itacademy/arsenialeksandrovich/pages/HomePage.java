package by.itacademy.arsenialeksandrovich.pages;

public class HomePage extends BasePage {
    protected String title = "Домашняя страница";
    protected String HOME_URL = getBASE_URL() + "/" + getTitle();

    private String getTitle() {
        return title;
    }

    private String getHOME_URL() {
        return HOME_URL;
    }

    @Override
    public void open() {
        System.out.println(getHOME_URL());
    }

    public void clickLogin() {
        System.out.println("Пользователь кликнул по кнопке \"Войти\"");
    }
}
