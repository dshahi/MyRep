package Test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSet1 {
  @Test
  public void TC1() {
	  System.out.println("TC1 execution");
  }
  
  @Test
  public void TC2() {
	  System.out.println("TC2 execution");
	  throw new SkipException("Skip this test cases");
  }
  
  @Test
  public void TC_3(){
	  System.out.println("TC3 execution");
	  Assert.assertEquals("Good","BAD");
  }
  
}
