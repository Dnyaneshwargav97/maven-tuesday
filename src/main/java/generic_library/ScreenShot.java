package generic_library;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	public void getphoto(WebDriver driver, String name) throws IOException {
		Date d=new Date(0);
		String currentdate=d.toString().replaceAll(":", "-");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(AutoConstant.photopath+currentdate+name+".png");
		FileUtils.copyFile(src, dest);
		
	}

}
