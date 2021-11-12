package StepObjects;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class StaticClasses {

//    @Step("select random elements")
    public static int selectRandom (ElementsCollection name){
        int maxProducts = name.size();
        int randomElement = (int) Math.floor(Math.random() * maxProducts);
        return randomElement;
    }
    @Test
    @Step ("get cities value from excel")
    public static String [] city() throws IOException, BiffException {
        String FilePath = "files/cities.xls";
        FileInputStream fs = new FileInputStream(FilePath);
        Workbook wb = Workbook.getWorkbook(fs);
        Sheet sheet = wb.getSheet("Sheet");
        int totalNoOfRows = sheet.getRows();
//        System.out.println(totalNoOfRows);
        int row = (int) Math.floor(Math.random() * totalNoOfRows);
        String value = sheet.getCell(0, row).getContents();
        String text = sheet.getCell(1, row).getContents();
        String [] city = {value, text};
        System.out.println(city);
        return city;
    }

}
