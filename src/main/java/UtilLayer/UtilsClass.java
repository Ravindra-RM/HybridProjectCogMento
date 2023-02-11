package UtilLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.Baseclass;

public class UtilsClass extends Baseclass{
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	
	public static void expVisibleElement(By element) {
	wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		
	} 
	
	public static void expClickElement(By element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
			
		} 
	
}
