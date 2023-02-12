package Third;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Oct17_Parameter {
  @Test
  @Parameters({"oper1","oper2","Message"})
  public void f(int a1,int a2,String a3) {
	  System.out.println(a3);
	  System.out.println(a1+a2);
  }
}
