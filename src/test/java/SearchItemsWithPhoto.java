import StepObjects.RegistrationSteps;
import StepObjects.SearchItemsWithPhotoSteps;
import Utils.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObjects.SearchItemsWithPhoto.*;
@Listeners(Utils.TestLister.class)

public class SearchItemsWithPhoto extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("Search product with image and add result to favourites")

    public void searchWithOneImg() {
        SearchItemsWithPhotoSteps steps = new SearchItemsWithPhotoSteps();
        RegistrationSteps step = new RegistrationSteps();
        step
                .closePopup();
        steps
                .clickOnSearchImgBtn()
                .uploadImg(imgSrc_1)
                .selectFavouriteResult()
                .goToFavItemsPage();

    }

    @Test(retryAnalyzer = Retry.class, priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Search product with image, add to favourites and check if count is correct")
    public void compareCount(){
        SearchItemsWithPhotoSteps steps = new SearchItemsWithPhotoSteps();
//        RegistrationSteps step = new RegistrationSteps();
//        step
//                .closePopup();
        steps
                .clickOnSearchImgBtn()
                .uploadImg(imgSrc_2)
                .selectFavouriteResult()
                .goToFavItemsPage()
                .favItemsCount(favItemsCount);
    }
}
