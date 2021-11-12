package StepObjects;

import PageObjects.SearchFilteredItemsPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import org.testng.Assert;

import static StepObjects.StaticClasses.*;

public class SearchFilteredItemsSteps extends SearchFilteredItemsPage{

    @Step ("Select Category")
    public SearchFilteredItemsSteps selectCategory(){
        categories.get(selectRandom(categories)).click();
        return this;
    }
    @Step("Choose how to buy")
    public SearchFilteredItemsSteps howToBuy(){
        buyOnlineRadio.get(selectRandom(buyOnlineRadio)).click();
        return this;
    }
    @Step("Choose Type")
    public SearchFilteredItemsSteps chooseType(){
        typeRadio.get(selectRandom(typeRadio)).click();
        return this;
    }
    @Step("Choose condition")
    public SearchFilteredItemsSteps condition(){
        conditionRadio.get(selectRandom(conditionRadio)).click();
        return this;
    }
    @Step("Choose promotion type")
    public SearchFilteredItemsSteps promotion(){
        promotionCheckbox.get(selectRandom(promotionCheckbox)).click();
        return this;
    }
    @Step ("select random Result, if there is any, if not delete selected options")
    public SearchFilteredItemsSteps deleteSelectedOptions(){
        if (noResults.isDisplayed()){
            System.out.println("no result");
            for (int i = 0; i < rmvSelectedOption.size(); i++) {
                rmvSelectedOption.get(i).click();
                deleteSelectedOptions();
            }
//            logo.click();
        }
        return this;
    }
    @Step ("select random Result")
    public SearchFilteredItemsSteps selectRandomResult(){
        results.get(selectRandom(results)).click();
        return this;
    }
    @Step("add to favs")
    public SearchFilteredItemsSteps addToFav(){
        addToFavBtn.click();
        return this;
    }
    @Step ("check favourites")
    public SearchFilteredItemsSteps checkFavourites(){
        goToFavourites.click();
        Assert.assertFalse(noFavs.is(Condition.visible));
        return this;
    }

//    @Step ("select cities")
//    public SearchFilteredItemsSteps selectCity() throws BiffException, IOException {
//        location.setValue(cities());
//        return this;
//    }
    @Step("return to main page")
    public SearchFilteredItemsSteps returnToMain(){
        logo.click();
        return this;
    }
    @Step ("set price range: min, value {min}, max, value {max}")
    public SearchFilteredItemsSteps setPriceRange(String min, String max){
        priceFrom.setValue(min);
        priceTo.setValue(max);
        return this;
    }
    @Step ("if possible add to cart")
    public SearchFilteredItemsSteps addToCart(){
        if(!addToCartBtns.isEmpty()){
            addToCartBtns.get(selectRandom(addToCartBtns)).click();
        }
        return this;
    }
    @Step("check cart")
    public SearchFilteredItemsSteps checkCart(){
        goToCart.click();
        Assert.assertFalse(emptyCart.is(Condition.visible));
        return this;
    }
}
