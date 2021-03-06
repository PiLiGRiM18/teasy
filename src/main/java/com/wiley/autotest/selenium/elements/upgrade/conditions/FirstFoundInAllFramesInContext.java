package com.wiley.autotest.selenium.elements.upgrade.conditions;

import com.wiley.autotest.TeasyExpectedConditions;
import com.wiley.autotest.selenium.elements.upgrade.TeasyElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.function.Function;

/**
 * Created by vefimov on 25/05/2017.
 */
public class FirstFoundInAllFramesInContext implements ElementCondition {

    private TeasyElement context;

    public FirstFoundInAllFramesInContext(TeasyElement context) {
        this.context = context;
    }

    @Override
    public Function<WebDriver, List<WebElement>> visibilities(By locator) {
        return TeasyExpectedConditions.visibilityOfFirstElementsInAllFrames(context, locator);
    }

    @Override
    public Function<WebDriver, WebElement> visibility(By locator) {
        return TeasyExpectedConditions.visibilityOfFirstElementInAllFrames(context, locator);
    }

    @Override
    public Function<WebDriver, List<WebElement>> presences(By locator) {
        return TeasyExpectedConditions.presenceOfAllElementsInAllFrames(context, locator);
    }

    @Override
    public Function<WebDriver, WebElement> presence(By locator) {
        return TeasyExpectedConditions.presenceOfElementInAllFrames(context, locator);
    }
}
