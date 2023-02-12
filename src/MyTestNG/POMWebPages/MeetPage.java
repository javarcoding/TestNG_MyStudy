package MyTestNG.POMWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MeetPage {
 
	WebDriver driver=null;
	public MeetPage(WebDriver drv) {
		// TODO Auto-generated constructor stub
		driver=drv;
	}
	By NewMeeting=By.xpath("//input[1]//preceding::button");
	public void createNewMeet() {
		// TODO Auto-generated method stub
        driver.findElement(NewMeeting);
	}
}
