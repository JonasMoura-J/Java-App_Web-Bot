package com.webbot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBotApplication {
 
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com");	
		
		boolean i = driver.getPageSource().contains("A");
		System.out.println("Possui A? "+(i?"Sim":"Não")); 
	
		driver.get("http://www.uol.com.br");	
		i = driver.getPageSource().contains("Grande SP");
		System.out.println("Possui A? "+(i?"Sim":"Não"));
		
		driver.close(); 
	}
}