package DataObjects;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public interface SearchItemsWithPhoto {
    String
        imgSrc_1 = "C:\\Users\\user\\IDE\\Final-Project_Test\\files\\1.jpeg",
        imgSrc_2 = "C:\\Users\\user\\IDE\\Final-Project_Test\\files\\2.jpg";

    int
        favItemsCount = Integer.parseInt($(by("href", "/ka/favorites")).find("span").getOwnText());
}
