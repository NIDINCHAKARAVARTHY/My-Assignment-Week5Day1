package week5day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OppWithout extends BaseClass2 {
	
	@Test(priority=1)
	
	public  void oppWithout() throws InterruptedException {
		
		
		driver.findElement(By.xpath("(//div[@class='tooltipTrigger tooltip-trigger uiTooltip']/div)[2]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(5000);
		WebElement a = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", a);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("03/20/2023");
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		
		WebElement text1 = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
		WebElement text2 = driver.findElement(By.xpath("(//div[@class='slds-form-element__help'])[2]"));
		
		if(text1.isDisplayed() && text2.isDisplayed()) {
			System.out.println("Two Feilds Are Verified");
		}else {
			System.out.println("Two Feilds Are Not Verified");
		}
		
	}

}
