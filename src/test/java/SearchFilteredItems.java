import StepObjects.RegistrationSteps;
import StepObjects.SearchFilteredItemsSteps;
import Utils.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jxl.read.biff.BiffException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(Utils.TestLister.class)

public class SearchFilteredItems extends ChromeRunner{
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("Search Items with different selection options, and choose one of them, if there is any, " +
            "if not delete selectors")

    public void searchFilteredResults() {
//        RegistrationSteps step = new RegistrationSteps();
//        step
//                .closePopup();
        SearchFilteredItemsSteps steps = new SearchFilteredItemsSteps();
        steps
                .selectCategory()
                .howToBuy()
                .chooseType()
                .condition()
                .deleteSelectedOptions()
                .selectRandomResult()
                .addToFav()
                .checkFavourites();

    }

    @Test(retryAnalyzer = Retry.class, priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Search Items with min and max price")
    public void setPriceRange() throws BiffException, IOException {
//        RegistrationSteps step = new RegistrationSteps();
//        step
//                .closePopup();
        SearchFilteredItemsSteps steps = new SearchFilteredItemsSteps();
        steps
                .returnToMain()
                .selectCategory()
//                .selectCity()
                .setPriceRange("100", "1000")
                .addToCart()
                .checkCart();
    }
}
