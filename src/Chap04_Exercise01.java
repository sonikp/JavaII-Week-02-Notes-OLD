import java.awt.Color;

public class Chap04_Exercise01
{
	public static void main(String[] args)
	{
		
		//String myPicture = FileChooser.pickAFile();
		//System.out.println(myPicture);
		
		
		String myPicture = "/Users/mfloerchinger/Documents/z.JavaProgramming/UCSD/Java II/CourseCD/mediasources/arch.jpg";
		
		// create picture object
		Picture picObject = new Picture(myPicture);
		
		// use explore method to view RGB of picture
		picObject.explore();		// .explore(); is the RGB color explorer for a picture file
		System.out.println(picObject);
		
		// show dimensions
		System.out.println(picObject.getHeight());
		System.out.println(picObject.getWidth());
		
		// get particular pixel
		System.out.println(picObject.getPixel(240, 180));
		
		// get picture array page 86
		System.out.println("\nget picture array");
		Pixel[] pixelArray = picObject.getPixels();	// <= getPixels() works here
		System.out.println(pixelArray[0]);

		/*
		// Version 1: prints out the color array for the entire picture file
		System.out.println("\nprint entire array");
		for (int i = 0; i <= pixelArray.length; i++)
		{
			System.out.println(pixelArray[i]);
		}
				
		*/
		
		
		// Version 2: prints out the color array for the entire picture file
		for ( Pixel pixelObj : pixelArray )
		{
			System.out.println(pixelObj);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Exercise Section 4.2 Manipulating Pictures : page 89
		/* --------------------------------------------------------------------------------------
		//String fName = "/home/notroot/Java/JavaII/AdditionalSoftware/mediasources/640x480.jpg";
		String fName = "/home/notroot/Java/JavaII/AdditionalSoftware/mediasources/barbara.jpg";
		//String fName = FileChooser.pickAFile();
		System.out.println(fName);
		
		Picture picture = new Picture(fName);
		picture.show();
		
		// set pixel color
		picture.getPixel(10,100).setColor(Color.black);
		picture.getPixel(11,100).setColor(Color.black);
		picture.getPixel(12,100).setColor(Color.black);
		picture.getPixel(13,100).setColor(Color.black);
		picture.getPixel(14,100).setColor(Color.black);
		picture.getPixel(15,100).setColor(Color.black);
		picture.getPixel(16,100).setColor(Color.black);
		picture.getPixel(17,100).setColor(Color.black);
		picture.getPixel(18,100).setColor(Color.black);
		picture.getPixel(19,100).setColor(Color.black);
		
		picture.repaint();
		picture.explore();
		
		picture.write("picture_chap04_ex_page89.jpg"); // <= I am guessing this is a linux filesystem permission issue
		// --------------------------------------------------------------------------------------
		
		*/
		
	}
}