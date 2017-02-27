/**
 * Created by saurabh on 27/02/17.
 */
import com.ElementLocators.AddressPage.AddNewAddress;
import com.ElementLocators.CheckoutPage.CheckoutPage;
import com.ElementLocators.FirstPage.FirstPage;
import com.ElementLocators.HomePage.HomePage;
import com.ElementLocators.RepairPage.RepairPage;
import com.ElementLocators.SelectDateTimePage.DateTimePage;
import com.ElementLocators.ServicePage.ServicePage;
import com.SharedProperties.SharedProperties;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MainApp extends SharedProperties {

    private static AndroidDriver driver;
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        File appDir = new File( "/Users/saurabh/Downloads");
        File app = new File(appDir, "UrbanClap_Services_v3.5.0_apkpure.com.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("deviceName", "MotoG3");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        Thread.sleep(10000);

        //getting started --> FirstPage
        SharedProperties.clickWithId(FirstPage.gettingStartedBtn(),driver);

        if(driver.findElements(By.id("com.urbanclap.urbanclap:id/location_selection_dialog_button_1")).size()!=0){
            driver.findElement(By.id("com.urbanclap.urbanclap:id/location_selection_dialog_button_1")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

        }
        //HomePage
        Thread.sleep(10000);

        SharedProperties.clickWithId(HomePage.getSearchField(),driver);
        Thread.sleep(10000);

        //SearchPage

        SharedProperties.sendKeys(HomePage.getSearchTextfield(),"plumber",driver);
        SharedProperties.clickWithId(HomePage.getSelectService(),driver);

        //ServicePage
        SharedProperties.clickWithId(ServicePage.getBookNowBtn(),driver);


        //RepairPage
        SharedProperties.Class(RepairPage.getRepairPage(),driver);

        //Select Address
        SharedProperties.clickWithId(AddNewAddress.getAddNewAddress(),driver);
        SharedProperties.sendKeys(AddNewAddress.getHouseNoText(),"333",driver);
        Thread.sleep(1000);

        SharedProperties.sendKeys(AddNewAddress.getLandMarkTxt(),"abc",driver);
        SharedProperties.clickWithId(AddNewAddress.getSaveBtn(),driver);

        //SelectDateTime

        SharedProperties.clickWithId(DateTimePage.getDateSelect(),driver);
        SharedProperties.clickWithId(DateTimePage.getTimeSelect(),driver);
        SharedProperties.clickWithId(DateTimePage.getContinueBtn(),driver);

        //checkout Page
        SharedProperties.clickWithId(CheckoutPage.getCheckoutBtn(),driver);

driver.quit();


    }
}