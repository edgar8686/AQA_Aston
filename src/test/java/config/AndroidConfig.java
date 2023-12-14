package config;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.example.lesson_17.elementPage.ElementPage;
import org.example.lesson_17.page.ElementsCalculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AndroidConfig {
    private static AndroidDriver androidDriver;
    private ElementsCalculator calculator = new ElementsCalculator(getAndroidDriver());
    private ElementPage elementPage = new ElementPage(getAndroidDriver());

    @BeforeAll
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capabilities.setCapability("app", "C:\\Users\\edgar\\GitProject\\AQA_Aston\\src\\test\\resources\\Calculator_8.4.1 (520193683)_Apkpure.apk");
        //dc.setCapability("isHeadless", "true");


        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        new WebDriverWait(androidDriver, Duration.ofSeconds(30));
    }


    @AfterAll
    public static void quite() {
        if (androidDriver != null) {
            androidDriver.quit();
        }
    }

    public ElementsCalculator getCalculator() {
        return calculator;
    }

    public ElementPage getElementPage() {
        return elementPage;
    }

    public static AndroidDriver getAndroidDriver() {
        return androidDriver;
    }
}
