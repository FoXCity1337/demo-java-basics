package by.itacademy.arsenialeksandrovich.pages;

public class LoginPage extends BasePage {

    private String title = "Форма логина";
    protected String LOGIN_PAGE = BASE_URL + "/" + getTitle();

    public String getTitle() {
        return title;
    }

    @Override
    public void open() {
        System.out.println(LOGIN_PAGE);
    }
}
