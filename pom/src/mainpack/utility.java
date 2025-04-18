package mainpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import website.homepage;
import website.myinfo;

public class utility {

	public static void main(String[] args) {
    WebDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
homepage h = new homepage(dr);               // we have create object here with reference of dr. 
h.username();                               // with the variable name called those method
h.pass();
h.submit();
		 myinfo m = new myinfo(dr);
		 m.details();
	}

}
