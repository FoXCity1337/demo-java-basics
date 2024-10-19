package by.itacademy.arsenialeksandrovich.pages;

public class HomePage extends BasePage {
    protected String title = "Домашняя страница";
    protected String HOME_URL = getBASE_URL() + "/" + getTitle();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHOME_URL() {
        return HOME_URL;
    }

    public void setHOME_URL(String HOME_URL) {
        this.HOME_URL = HOME_URL;
    }

    @Override
    public void open() {
        System.out.println(getHOME_URL());
    }

    public void clickLogin(){
        System.out.println("Пользователь кликнул по кнопке \"Войти\"");
    }

    public static void main(String[] args) {
        HomePage homePage = new HomePage();
        homePage.clickLogin();
    }
}
