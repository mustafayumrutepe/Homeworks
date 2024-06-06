package SdetHomework.Action_DragDrop;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Odev02 extends BaseDriver {
    @Test
    public void Test() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        List<WebElement> students = driver.findElements(By.xpath("//*[starts-with(@id,'node')]"));
        List<WebElement> boxes = driver.findElements(By.xpath("//ul[starts-with(@id,'box')]"));

        Actions aksiyonlar = new Actions(driver);
        int i = 0;
        for (int j = 0; j < students.size(); j++) {
            if (j >= 4 && j < 8)
                i = 1;
            else if (j >= 8 && j < 12)
                i = 2;
            else if (j >= 12 && j < 15)
                i = 3;
            else if (j >= 15)
                i = 4;

            aksiyonlar.clickAndHold(students.get(j)).build().perform();
            MyFunction.Wait(1);
            aksiyonlar.moveToElement(boxes.get(i)).release().build().perform();
        }

        BekleVeKapat();
    }

}
