package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class N11page {

    public N11page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
