package career.ru.tinkoff;

import career.ru.tinkoff.pages.AllPages;
import career.ru.tinkoff.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class MainPageTests extends TestBase {
    AllPages allPages = new AllPages();
    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Checking title on the main page")
    void checkTitle() {
        step("Open homepage", () -> {
            allPages.openPage("/");
        });
        step("Check title", () -> {
            allPages.checkTitle("Работа в Тинькофф");
        });
    }

    @Test
    @DisplayName("Checking the navigation menu correct data")
    void checkNavigationMenu() {
        String[] menuItems = {"Работа в IT", "Бизнес и процессы", "Работа с клиентами"};
        step("Open homepage", () -> {
            allPages.openPage("/");
        });
        step("Check navigation menu items", () -> {
            for (String menuItem : menuItems) {
                mainPage.checkNavigationMenu(menuItem);
            }
        });
    }
}
