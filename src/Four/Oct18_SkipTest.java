package Four;

import org.testng.annotations.Test;

public class Oct18_SkipTest {
	//simplest way is use enabled=false
  @Test(enabled=false)
  public void f() 
  {
	  System.out.println("This method will not be executed");
  }
  @Test()
  public void g()
  {
	  System.out.println("This method will be executed");
  }
  
  //Second way to skip the method from execution is exclude it from XML file
  //just run the XML file. if you run java file it will executed
  @Test
  public void SkipFromXML()
  {
	  System.out.println("This method will not be executed we made entry in XML file");
  }
}
