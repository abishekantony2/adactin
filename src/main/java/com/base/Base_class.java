package com.base;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Base_class {

public static WebDriver driver;

//browser lunch
public static  WebDriver browser_lunch(String chrome)

{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Eclipse_workspace\\Adactin\\driver\\chromedriver.exe");
return driver=new ChromeDriver();
}

//open url
public static void open_url(String url) {
driver.get(url);
}

//maximize
public static void max() {
driver.manage().window().maximize();
}

//sendkeys
public static void inputofelement(WebElement name,String a) {
name.sendKeys(a);
}
public static void inputofelement1(WebElement password,String a1) {
password.sendKeys(a1);
}


//NavigateTo
public static void NavigateTo(String url){
driver.navigate().to(url);
}

//refresh
public static void refersh(){
driver.navigate().refresh();
}

//navigate back
public static void Navigateback() {
driver.navigate().back();
}

// Navigateforward
public static void Navigateforward() {
driver.navigate().forward();
}

//implicit
public static void implicit()
{
driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
}
//click
public static void click(WebElement element) {
element.click();
}

//alert accept
public static void alertaccept() {
driver.switchTo().alert().accept();
}
//dismiss
public static void dismiss() {
driver.switchTo().alert().dismiss();
}
//alert sendkeys
public static void prompt(String key)
{
driver.switchTo().alert().sendKeys(key);                  
}


//get title
public static void gettitle()
{
String text = driver.getTitle();
System.out.println(text);
}

        //Getm url
public static void getmyurl() {
String currentUrl = driver.getCurrentUrl();
System.out.println("my curreenturl ="+ currentUrl);
}
      //get text
public static void gettext(WebElement a)
{ String text = a.getText();
System.out.println(text);
}

       //Drop down
public static void selectbyindex(WebElement a,int a1) {
Select s=new Select(a);
s.selectByIndex(a1);

}
public static void selectbyvalue(WebElement b,String b1) {
Select d=new Select(b);
d.selectByValue(b1);
}
public static void selectvisibletext(WebElement c,String c1) {
Select f=new Select(c);
f.selectByVisibleText(c1);
}
//screenshot

public static void screenshot() throws IOException
{ TakesScreenshot ts=(TakesScreenshot)driver;

  File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
  File destination  = new File("C:\\Users\\Abishek\\eclipse-workspace\\com.collection\\screenshots\\new.png");
 
FileUtils.copyFile(screenshotAs, destination);

}
//Action
  public static void actions(WebElement a)
  {
Actions b=new Actions(driver);
b.contextClick(a).build().perform();
}
//robots
public static void robotss() throws AWTException
{
Robot a=new Robot();
a.keyPress(KeyEvent.VK_DOWN);
a.keyRelease(KeyEvent.VK_DOWN);
a.keyPress(KeyEvent.VK_ENTER);
a.keyRelease(KeyEvent.VK_ENTER);
}

public static void scrolldown() {
JavascriptExecutor down=(JavascriptExecutor)driver;
down.executeScript("window.scroll(0,2000)", "");
}
public static void  scrollup () {
JavascriptExecutor up=(JavascriptExecutor)driver;
up.executeScript("window.scroll(0,0)", "");
}

 public static void windowshandlling() {
 Set<String> alltabs= driver.getWindowHandles();
for (String s : alltabs)
{  String title = driver.switchTo().window(s).getTitle();
System.out.println(title);
}
String x=("Help - Amazon Customer Service");
for (String s1 : alltabs) {
if (driver.switchTo().window(s1).getTitle().equalsIgnoreCase(x))
{ break;
}
 }}
  public static void ismultiple(WebElement x) {
  Select s=new Select(x);
  boolean multiple = s.isMultiple();
  System.out.println(multiple);
}
  public static void close(WebElement ele) {
	  driver.close();
	
}
  
  
  
        //Getoptions
public static void getoptions(WebElement x) {
Select s=new Select(x);
List<WebElement> options = s.getOptions();
for (WebElement convert : options) {
String text = convert.getText();
System.out.println(text);
}}
public static void is_enable(WebElement z)
{
z.isEnabled();
}}
