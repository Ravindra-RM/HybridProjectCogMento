package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;
import UtilLayer.UtilsClass;

public class HomePage extends Baseclass {
	
	@FindBy(xpath="//span[@class='user-display']")
	private WebElement username;
	
	@FindBy(xpath="//i[@class='money icon']")
	private WebElement deals;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement create;
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement title;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	private WebElement save;
	
	@FindBy(xpath="//div[@class='field']/div/p")
	private WebElement captitle;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	public String homepage() {
		
		return  username.getText();
		
	}
	
	public void Deals(String upath) {
		UtilsClass.expVisibleElement(By.xpath("//i[@class='money icon']"));
		UtilsClass.expVisibleElement(By.xpath("//i[@class='money icon']"));
		deals.click();
		UtilsClass.expVisibleElement(By.xpath("//button[text()='Create']"));
		UtilsClass.expClickElement(By.xpath("//button[text()='Create']"));
		create.click();
	
		title.sendKeys(upath);
		
		save.click();
	}
	public String caputuretitle() {
		return captitle.getText();
	}
	

}
