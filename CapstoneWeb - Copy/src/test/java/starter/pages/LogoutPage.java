package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {
    private By iconLogout(){
        return By.xpath("//div[@class= 'flex items-center text-center mt-auto hover:text-primaryMain cursor-pointer flex-col justify-center gap-1']");
    }
    @Step
    public void clickIconLogout(){
        $(iconLogout()).click();
    }
}
