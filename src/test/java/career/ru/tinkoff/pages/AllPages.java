package career.ru.tinkoff.pages;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class AllPages {
    public AllPages openPage(String url) {
        open(url);
        return this;
    }

    public AllPages checkTitle(String title) {
        String actualTitle = title();
        assertThat(actualTitle).isEqualTo(title);
        return this;
    }
}