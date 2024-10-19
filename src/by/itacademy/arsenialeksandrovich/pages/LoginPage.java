package by.itacademy.arsenialeksandrovich.pages;

public class LoginPage extends BasePage {
    String title = "Форма логина";
    protected String LOGIN_PAGE = getBASE_URL() + "/" + getTitle();

    private String getTitle() {
        return title;
    }

    public String getLOGIN_PAGE() {
        return LOGIN_PAGE;
    }

    @Override
    public void open() {
        System.out.println(getLOGIN_PAGE());
    }
}
