package SdetHomework.Action_DragDrop;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Odev03 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        List<WebElement> cities = driver.findElements(By.xpath("//*[starts-with(@id,'node')]"));
        List<WebElement> countries = driver.findElements(By.xpath("//ul[starts-with(@id,'box')]"));

        Actions aksiyonlar = new Actions(driver);

        for (WebElement country : countries) {
            for (WebElement city : cities) {
                if (city.getAttribute("groupid").replaceAll("[^0-9]", "").equals(country.getAttribute("id").replaceAll("[^0-9]", ""))) {
                    aksiyonlar.clickAndHold(city).build().perform();
                    MyFunction.Wait(1);
                    aksiyonlar.moveToElement(country).release().build().perform();
                }
            }
        }

        BekleVeKapat();
    }
}
