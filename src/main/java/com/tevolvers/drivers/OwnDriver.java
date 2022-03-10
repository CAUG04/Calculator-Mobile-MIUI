package com.tevolvers.drivers;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class OwnDriver {
    private static AndroidDriver driver;

    public static void initDriver() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appium:deviceName", "128d90340507");
        desiredCapabilities.setCapability("appium:appActivity", "com.miui.calculator.cal.CalculatorActivity");
        desiredCapabilities.setCapability("appium:appPackage", "com.miui.calculator");
        desiredCapabilities.setCapability("appium:noReset", "true");
        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723/wd/hub"),
                desiredCapabilities
        );
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static AndroidDriver getDriver() {
        return driver;
    }
}