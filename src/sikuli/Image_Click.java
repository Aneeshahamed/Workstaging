package sikuli;

import java.io.File;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Image_Click {

	public static void main(String[] args) throws Exception 
	{
		Screen capt = new Screen();
		for(int i=0; i<=234; i++)
        {
			System.out.println("File Name = "+i);
			if(capt.exists("E:\\Automation\\Captcha\\bicycles\\"+i+".jpg") != null)
			{
				Pattern pattern = new Pattern ("E:\\Automation\\Captcha\\bicycles\\"+i+".jpg");
				System.out.println(pattern.isValid());
				capt.click(pattern);
			}
        }	
	}
}
