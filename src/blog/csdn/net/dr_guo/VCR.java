package blog.csdn.net.dr_guo;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
public class VCR {
	public static void main(String[] args) {
		File root = new File(System.getProperty("user.dir") + "/imgs");
		ITesseract instance = new Tesseract();

		try {
			File[] files = root.listFiles();
			for (File file : files) {
				String result = instance.doOCR(file);
				String fileName = file.toString().substring(file.toString().lastIndexOf("\\")+1);
				System.out.println("fileName" + fileName +" result"+result);
			}
		} catch (TesseractException e) {
			System.err.println(e.getMessage());
		}
    }
}