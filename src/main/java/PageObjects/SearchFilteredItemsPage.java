package PageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchFilteredItemsPage {
    protected SelenideElement
        noResults = $(byText("სამწუხაროდ, ვერაფერი მოიძებნა")),
        location = $(by("name", "LocID")),
        priceFrom = $(by("name", "PriceFrom")),
        priceTo = $(by("name", "PriceTo")),
        goToCart = $(by("href", "/ka/mycart")),
        emptyCart = $(byText("შენი კალათი ცარიელია")),
        noFavs = $(byText("შენ არ გაქვს ფავორიტების სია")),
        goToFavourites = $(by("href", "/ka/favorites")),
        addToFavBtn = $(by("title", "რჩეულებში დამატება")),
        logo = $(".logo_");

    protected ElementsCollection
        categories = $$(".primary-cats-text"),
        buyOnlineRadio = $$(by("name", "Online")),
        typeRadio = $$(by("name", "SetTypeID")),
        conditionRadio = $$(by("name", "CondTypeID")),
        promotionCheckbox = $$(by("name", "Prom")),
        rmvSelectedOption = $$("button.close-tags"),
        addToCartBtns = $$(".btn.toggle-cart"),
        results = $$(".card-col");

}
