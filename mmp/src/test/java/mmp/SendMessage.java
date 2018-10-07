package mmp;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;
	public class SendMessage {

		
	   FirefoxDriver driver=new FirefoxDriver();
	  @Test
	  
	  public void veryfyMMPSendMessage()
	  {
	  driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/index.php");
	  navigateToAPage("Message");
	  contactReason();
	  Subject();
	  send();
	  //verifyMessage();
	  }
	  public void navigateToAPage(String tabname)
	  {
		  driver.findElementByXPath("//a/span[contains(text(),'" +tabname+ "')]").click();
	  }
		
	public void contactReason()
	{
		driver.findElementById("subject").sendKeys("Fever");
	}
	public void Subject()
	{
		driver.findElementById("message").sendKeys("Need to meet doctor");
	}
	public void send()
	{
		driver.findElementByXPath("//input[@value='Send' and @type='submit']").click();
		
	}
	//public void verifyMessage ()
	//{
		//driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/messagedb.php");
	    //   System.out.println("Messages successfully sent");
	//}
	}
	
	

