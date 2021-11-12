package StepObjects;

import PageObjects.SearchItemsWithPhotoPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import static StepObjects.StaticClasses.selectRandom;

public class SearchItemsWithPhotoSteps extends SearchItemsWithPhotoPage {

    @Step ("click on search with photo")
    public SearchItemsWithPhotoSteps clickOnSearchImgBtn(){
        imgSearchBtn.click();
//        Assert.assertTrue(uploadPhotoText.isDisplayed());
        return this;
    }

    @Step ("upload img, value {src}")
    public SearchItemsWithPhotoSteps uploadImg (String src){
        uploadImg.sendKeys(src);
        searchBtn.click();
        return this;
    }

    @Step ("select one of the results and add to favourites, value {index}")
    public SearchItemsWithPhotoSteps selectFavouriteResult(){
        resultBlocks.get(selectRandom(resultBlocks)).click();
        addToFavouritesBtn.click();
        return this;
    }
    @Step ("start search")
    public SearchItemsWithPhotoSteps startSearch(){
        searchBtn.click();
        return this;
    }
    @Step ("check favourites page")
    public SearchItemsWithPhotoSteps goToFavItemsPage(){
        goToFavourites.click();
        Assert.assertFalse(noFavourite.isDisplayed());
        return this;
    }
    @Step ("compare favourite items number and shown count")
    public SearchItemsWithPhotoSteps favItemsCount(int favItemsCount){
        Assert.assertEquals(favouriteItemsList.size(), favItemsCount);
        return this;
    }
}
