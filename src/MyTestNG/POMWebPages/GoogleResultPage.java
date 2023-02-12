package MyTestNG.POMWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleResultPage {

	WebDriver driver=null;
	public GoogleResultPage(WebDriver drv) {
		// TODO Auto-generated constructor stub
		driver=drv;
	}
	 By searchbox=By.xpath("//*[@name='q']");
	By SearchButton=By.xpath("//*[@name='q']//following::*[16]");
	By Result=By.xpath("//*[@id=\"result-stats\"]");
	By VideoSearch=By.xpath("//a[text()=\"Videos\"]");
	
	public void displayResult() {
		// TODO Auto-generated method stub
         String res=driver.findElement(Result).getText();
         System.out.println("Result="+res);
	}
	public void SearchFunction(String str) {
		// TODO Auto-generated method stub
		clearSearch();
        driver.findElement(searchbox).sendKeys(str);
        driver.findElement(SearchButton).click();
	}
	public void clearSearch() {
		// TODO Auto-generated method stub
		driver.findElement(searchbox).clear() ;
	}
	public void videoSearch() {
		// TODO Auto-generated method stub
        driver.findElement(VideoSearch).click();
	}
}
