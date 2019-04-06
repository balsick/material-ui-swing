package it.balsick.swing.material.dark.utils;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class DarkMaterialImages
	{

	public static final BufferedImage RIGHT_ARROW = loadImg ("/imgs/right_arrow_w.png");
	public static final BufferedImage LEFT_ARROW = loadImg ("/imgs/left_arrow_w.png");
	public static final BufferedImage DOWN_ARROW = loadImg ("/imgs/down_arrow_w.png");
	public static final BufferedImage UP_ARROW = loadImg ("/imgs/up_arrow_w.png");
	public static final BufferedImage CHECKED_BOX = loadImg ("/imgs/painted_checked_box_w.png");
	public static final BufferedImage UNDETERMINED_CHECKED_BOX = loadImg ("/imgs/painted_checked_box_w.png");
	//	public static final BufferedImage OUTLINED_CHECKED_BOX = loadImg ("/imgs/outlined_checked_box_w.png");
	public static final BufferedImage UNCHECKED_BOX = loadImg ("/imgs/unchecked_box_w.png");
	public static final BufferedImage RADIO_BUTTON_ON = loadImg ("/imgs/radio_button_on_w.png");
	public static final BufferedImage RADIO_BUTTON_OFF = loadImg ("/imgs/radio_button_off_w.png");
	public static final BufferedImage TOGGLE_BUTTON_ON = loadImg ("/imgs/toggle_on_w.png");
	public static final BufferedImage TOGGLE_BUTTON_OFF = loadImg ("/imgs/toggle_off_w.png");
	public static final BufferedImage BACK_ARROW = loadImg ("/imgs/back_arrow_w.png");
	public static final BufferedImage COMPUTER = loadImg ("/imgs/computer_w.png");
	public static final BufferedImage FILE = loadImg ("/imgs/file_w.png");
	public static final BufferedImage FLOPPY_DRIVE = loadImg ("/imgs/save_w.png");
	public static final BufferedImage FOLDER = loadImg ("/imgs/folder_w.png");
	public static final BufferedImage HARD_DRIVE = loadImg ("/imgs/storage_w.png");
	public static final BufferedImage HOME = loadImg ("/imgs/home_w.png");
	public static final BufferedImage LIST = loadImg ("/imgs/list_w.png");
	public static final BufferedImage NEW_FOLDER = loadImg ("/imgs/new_folder_w.png");
	public static final BufferedImage DETAILS = loadImg ("/imgs/details_w.png");
	public static final BufferedImage YES_COLLAPSED = loadImg ("/imgs/expand_more_w.png");
	public static final BufferedImage NO_COLLAPSED = loadImg ("/imgs/expand_less_w.png");
	public static final BufferedImage ERROR = loadImg ("/imgs/error.png");
	public static final BufferedImage WARNING = loadImg ("/imgs/warning.png");
	public static final BufferedImage QUESTION = loadImg ("/imgs/question.png");
	public static final BufferedImage INFORMATION = loadImg ("/imgs/information.png");


	private DarkMaterialImages () {}

	private static BufferedImage loadImg (String imgPath) {
		try (InputStream inputStream = DarkMaterialImages.class.getResourceAsStream (imgPath)) {
			return ImageIO.read (inputStream);
		}
		catch (IOException e) {
			e.printStackTrace ();
			throw new RuntimeException ("Image " + imgPath + " wasn't loaded");
		}
	}
}
