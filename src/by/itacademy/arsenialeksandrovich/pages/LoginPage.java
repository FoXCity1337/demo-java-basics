package by.itacademy.arsenialeksandrovich.pages;

public class LoginPage extends BasePage {
    String title = "Форма логина";
    protected String LOGIN_PAGE = getBASE_URL() + "/" + getTitle();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
