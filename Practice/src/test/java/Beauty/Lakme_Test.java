package Beauty;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lakme_Test {
	@Test
	public void lakmeindia() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lakmeindia.com/");
		driver.quit();
	}

}
