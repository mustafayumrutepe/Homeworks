package SdetHomework.Action_DragDrop;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Odev01 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        Actions aksiyonlar = new Actions(driver);

        List<WebElement> countries = driver.findElements(By.cssSelector("div#questionDiv > div[id^='q']"));
        List<WebElement> cities = driver.findElements(By.cssSelector("div#answerDiv > div[id^='a']"));

        for (WebElement country : countries) {
            for (WebElement city : cities) {
                if (city.getAttribute("id").replaceAll("[^0-9]", "").equals(country.getAttribute("id").replaceAll("[^0-9]", ""))) {
                    String c = "div#" + country.getAttribute("id") + " + div";
                    WebElement space = driver.findElement(By.cssSelector(c));
                    aksiyonlar.clickAndHold(city).build().perform();
                    MyFunction.Wait(1);
                    aksiyonlar.moveToElement(space).release().build().perform();
                }
            }
        }
        BekleVeKapat();
    }
}
