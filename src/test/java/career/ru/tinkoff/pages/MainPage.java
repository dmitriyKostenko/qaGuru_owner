package career.ru.tinkoff.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    public void checkNavigationMenu(String menuItem) {
        $$("[data-qa-type='uikit/navigation.menu']").findBy(text(menuItem)).shouldHave(text(menuItem));
    }
}
