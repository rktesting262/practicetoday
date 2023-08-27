package jpmcproj;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	//public static void main(String[] args) {
	@Test
	public void method1()
	{
		System.out.println("hi rk");
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
	//	ChromeDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		

	}

}
