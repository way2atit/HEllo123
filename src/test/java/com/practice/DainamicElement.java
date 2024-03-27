package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DainamicElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/contacts");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		WebElement username = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		username.sendKeys("abhijeet.kumbhar1988@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("gautami@7575");

		/* driver.navigate().to("https://ui.freecrm.com/contacts"); */
		WebElement btn = driver.findElement(By.xpath("//*[text()=\"Login\"]"));
		btn.click();

		List<WebElement> allElements = driver.findElements(By.xpath("//tbody/tr/td[2]/a"));
		System.out.println(allElements.size());
		Thread.sleep(4000);
		int j;
		for (int i = 0; i < allElements.size(); i++) {
			j = i + 1;
			if (allElements.get(i).getText().contains("abhi kumbhar")) {

				WebElement Address = driver.findElement(By.xpath("(//tbody/tr/td[3])[" + j + "]"));
				WebElement category = driver.findElement(By.xpath("(//tbody/tr/td[4])[" + j + "]"));
				WebElement status = driver.findElement(By.xpath("(//tbody/tr/td[5])[" + j + "]"));
				WebElement phone = driver.findElement(By.xpath("(//tbody/tr/td[6])[" + j + "]"));
				WebElement email = driver.findElement(By.xpath("(//tbody/tr/td[7])[" + j + "]"));
				System.out.println(Address.getText() + " " + category.getText() + " " + status.getText() + " "
						+ phone.getText() + "" + email.getText());

			}
			j++;
		}
	}

}
