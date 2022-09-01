package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
  @Test
  public void f()
  {
	  Reporter.log("Hello world",true);
  }
}
