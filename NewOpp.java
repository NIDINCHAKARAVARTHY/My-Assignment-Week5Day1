package week5day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewOpp extends BaseClass2{
	
	@Test(priority=2)
	public  void newOpp() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[@class='tooltipTrigger tooltip-trigger uiTooltip']/div)[2]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(5000);
		WebElement a = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", a);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		WebElement b = driver.findElement(By.xpath("(//input[@class='slds-input'])[4]"));
		b.sendKeys("Salesforce Automation By Nidin");
		String text = b.getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("03/19/2023");
		driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("(//lightning-base-combobox-item[@class='slds-media slds-listbox__option slds-media_center slds-media_small slds-listbox__option_plain'])[3]")).click();
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		WebElement c = driver.findElement(By.xpath("//slot[@class='slds-page-header__title slds-m-right--small slds-align-middle clip-text slds-line-clamp']/lightning-formatted-text"));
		String name = c.getText();
		System.out.println(name);
		
		if(c.isDisplayed()) {
			System.out.println("Oppurtunity Name Is Verified");
		}else {
			System.out.println("Oppurtunity Name Is Not Verified");
		}
		
		
	}

}
