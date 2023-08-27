package jpmcproj;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("hi rk test1");
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
	//	ChromeDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		

	}

}
