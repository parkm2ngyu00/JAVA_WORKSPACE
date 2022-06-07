import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageTest {

	// print image info
	static void print(String filename) {
		BufferedImage image = null;
		try {
			// read image
			image = ImageIO.read(new File(filename));
			// find image info
			int width = image.getWidth();
			int height = image.getHeight();
			String ext = filename.substring(filename.lastIndexOf('.')+1);
			System.out.println("filename=" + filename);
			System.out.println("width=" + width);
			System.out.println("height=" + height);
			System.out.println("ext="+ ext);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// print image info
	static void print2(String filename) throws IOException {
		// read image
		BufferedImage image = ImageIO.read(new File(filename));
		// find image info
		int width = image.getWidth();
		int height = image.getHeight();
		String ext = filename.substring(filename.lastIndexOf('.')+1);
		System.out.println("filename=" + filename);
		System.out.println("width=" + width);
		System.out.println("height=" + height);
		System.out.println("ext="+ ext);
	}
		
	public static void main(String[] args) {
		// print
		print("dog.jpg");
		// print2
		try {
			print2("dog.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
