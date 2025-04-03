package com.testUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;

public class AllureListeners implements ITestListener {
    public void onTestSuccess(ITestResult result) {
        saveScreenshot(result.getMethod().getMethodName());
    }

    public void onTestFailure(ITestResult result) {
        saveScreenshot(result.getMethod().getMethodName());
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] saveScreenshot(String testName) {
        File screenshot = new File(System.getProperty("user.dir") + "/screenshots/" + testName + ".png");
        try {
            return Files.readAllBytes(screenshot.toPath());
        } catch (IOException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }

}
