package Four;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Oct18_Assert {
  @Test(dataProvider = "mydp")
  public void f(int a,int b,int c) {
	  System.out.println("Addition Check:  a= "+a+"b= "+b+"c= "+c);
	  SoftAssert as=new SoftAssert();
	  as.assertEquals(c, (a+b),"Checking");
	  System.out.println("Statement after soft assret alwayss get executed");
  }
  
  
  @DataProvider
  public Object[][] mydp() {
    return new Object[][] {
      new Object[] { 10,20,30 },
      new Object[] { 89,10,54 },
      new Object[] { 15,10,25 },
      new Object[] { 5,105,110 },
    };
}
}