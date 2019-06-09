package findAndRenameFile;

import java.io.File;
import java.io.IOException;

public class RenameFile {
	static int count=0;

	public static void main(String[] args) throws Exception
	{
		File file = new File("E:\\Automation\\Captcha\\traffic lights\\");
        String[] fileList = file.list();
        int a = fileList.length;
        System.out.println(a);
        for(int i=0; i<a; i++)
        {
        	System.out.println(fileList[i]);
        	changeFileName(fileList[i]);
        	count++;
        }
        System.out.println("Total = "+count);	
	}
	public static void changeFileName(String fileName) throws Exception
	{
		File file1 = new File("E:\\Automation\\Captcha\\traffic lights\\"+fileName+"");
		File file2 = new File("E:\\Automation\\Captcha\\traffic lights\\"+count+".jpg");
		if (file2.exists())
		  throw new java.io.IOException("file exists");	
		boolean success = file1.renameTo(file2);
		if (!success) {
		   // File was not successfully renamed
		}
		
		
	}

}
