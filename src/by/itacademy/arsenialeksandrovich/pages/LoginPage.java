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

    public String getLOGIN_PAGE() {
        return LOGIN_PAGE;
    }

    public void setLOGIN_PAGE(String LOGIN_PAGE) {
        this.LOGIN_PAGE = LOGIN_PAGE;
    }

    @Override
    public void open() {
        System.out.println(getLOGIN_PAGE());
    }
}
