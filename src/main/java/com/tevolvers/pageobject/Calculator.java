package com.tevolvers.pageobject;

import com.tevolvers.drivers.OwnDriver;
import org.openqa.selenium.By;

public class Calculator {

    private static Calculator calculator;

    public static Calculator initCalculator(){
        if(calculator == null){
            calculator = new Calculator();
        }
        return calculator;
    }

    public static Calculator getCalculator(){
        return calculator;
    }

    public void clickNumber(String number){
        for (int i=0; i<number.length(); i++){
            OwnDriver.getDriver().findElement(By.id("com.miui.calculator:id/btn_" + number.charAt(i) + "_s")).click();
        }
    }

    public String getResult(){
        return OwnDriver.getDriver().findElement(By.id("com.miui.calculator:id/result")).getAttribute("Text");

    }

    public void clickOperand(String operand){
       switch (operand){
           case "+":
               OwnDriver.getDriver().findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
               break;
           case "=":
               OwnDriver.getDriver().findElement(By.id("com.miui.calculator:id/btn_equal_s")).click();
               break;
       }
    }
}