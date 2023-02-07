// IsDisplayed = used to find web element is there or not

package SeleniumNewProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog6ISfuntion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","D:\\TESTING DOCUMENTS\\chromedriver_win32\\chromedriver.exe"); //Mandatory
		ChromeDriver d=new ChromeDriver(); // Mandatory
		d.manage().window().maximize();
		d.get("https://admission.lpu.in/");
		WebElement w=d.findElement(By.name("city_id"));
		if(w.isDisplayed())
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
	}

}
