package by.itacademy.arsenialeksandrovich.pages;

public class Main {
    public static void main(String[] args) {
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.clickLogin();
        LoginPage loginPage = new LoginPage();
        loginPage.open();
    }
}
