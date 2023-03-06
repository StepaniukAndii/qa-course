package patterns.threedLocal;

public class HomePage extends BasePage {

    public HomePage open() {
        openUrl("https://rozetka.com.ua");
        return this;
    }

    public HomePage setValue() {
        setValue("1234556", "//input");
        return this;
    }
}
