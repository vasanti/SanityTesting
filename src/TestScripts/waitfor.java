package TestScripts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestSuiteBase.SuiteBase;

public class waitfor extends SuiteBase
{

public static WebElement until(WebElement locator)
{

WebElement ele = null;
ele = wait.until(ExpectedConditions.visibilityOf(locator));
ele = wait.until(ExpectedConditions.elementToBeClickable(locator));


return ele;

}

}