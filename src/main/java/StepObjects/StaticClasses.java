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

    @Step("select random elements")
    public static int selectRandom (ElementsCollection name){
        int maxProducts = name.size();
        int randomElement = (int) Math.floor(Math.random() * maxProducts);
        return randomElement;
    }
    @Test
    @Step ("get cities from excel")
    public static String cities() throws IOException, BiffException {
        String FilePath = "files/cities.xls";
        FileInputStream fs = new FileInputStream(FilePath);
        Workbook wb = Workbook.getWorkbook(fs);
        Sheet sheet = wb.getSheet("Sheet");
        int totalNoOfRows = sheet.getRows();
//        System.out.println(totalNoOfRows);
        int row = (int) Math.floor(Math.random() * totalNoOfRows);
        String test = sheet.getCell(0, row).getContents();
        return test;
    }
}
