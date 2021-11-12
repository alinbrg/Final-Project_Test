package PageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchItemsWithPhotoPage {
    protected SelenideElement
        imgSearchBtn = $(".img-upload"),
        uploadPhotoText = $(byText("ატვირთე ფოტო მსგავსი პროდუქციის საპოვნელად")),
        searchInput = $(by("name", "keyword")),
        searchBtn = $(".search-icon"),
        uploadImg = $("#selectImageForSearch"),

        addToFavouritesBtn = $(".favorites-add-i"),
        noFavourite = $(byText("შენ არ გაქვს ფავორიტების სია")),
        goToFavourites = $(by("href", "/ka/favorites"));

    protected ElementsCollection
        resultBlocks = $$(".card-col"),
        favouriteItemsList = $(".favorites-cards").$$(".cards");
}
