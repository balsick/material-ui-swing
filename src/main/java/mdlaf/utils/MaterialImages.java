package mdlaf.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class MaterialImages {

	public static final BufferedImage RIGHT_ARROW = loadImg("/imgs/arrow_right.png");
	public static final BufferedImage LEFT_ARROW = loadImg("/imgs/arrow_left.png");
	public static final BufferedImage DOWN_ARROW = loadImg("/imgs/arrow_down.png");
	public static final BufferedImage UP_ARROW = loadImg("/imgs/arrow_up.png");
	public static final BufferedImage CHECKED_BOX = loadImg("/imgs/painted_checked_box.png");
	public static final BufferedImage UNDETERMINED_CHECKED_BOX = loadImg("/imgs/painted_checked_box.png");
	//	public static final BufferedImage OUTLINED_CHECKED_BOX = loadImg ("/imgs/outlined_checked_box.png");
	public static final BufferedImage UNCHECKED_BOX = loadImg ("/imgs/unchecked_box.png");
	public static final BufferedImage RADIO_BUTTON_ON = loadImg ("/imgs/radio_button_on.png");
	public static final BufferedImage RADIO_BUTTON_OFF = loadImg ("/imgs/radio_button_off.png");
	public static final BufferedImage TOGGLE_BUTTON_ON = loadImg ("/imgs/toggle_on.png");
	public static final BufferedImage TOGGLE_BUTTON_OFF = loadImg ("/imgs/toggle_off.png");
	public static final BufferedImage BACK_ARROW = loadImg ("/imgs/back_arrow.png");
	public static final BufferedImage COMPUTER = loadImg ("/imgs/computer.png");
	public static final BufferedImage FILE = loadImg ("/imgs/file.png");
	public static final BufferedImage FLOPPY_DRIVE = loadImg("/imgs/save.png");
	public static final BufferedImage FOLDER = loadImg ("/imgs/folder.png");
	public static final BufferedImage HARD_DRIVE = loadImg("/imgs/storage.png");
	public static final BufferedImage HOME = loadImg ("/imgs/home.png");
	public static final BufferedImage LIST = loadImg ("/imgs/list.png");
	public static final BufferedImage NEW_FOLDER = loadImg ("/imgs/new_folder.png");
	public static final BufferedImage DETAILS = loadImg ("/imgs/details.png");
	public static final BufferedImage YES_COLLAPSED = loadImg("/imgs/expand_more.png");
	public static final BufferedImage NO_COLLAPSED = loadImg("/imgs/expand_less.png");
	public static final BufferedImage ERROR = loadImg ("/imgs/error.png");
	public static final BufferedImage WARNING = loadImg ("/imgs/warning.png");
	public static final BufferedImage QUESTION = loadImg ("/imgs/question.png");
	public static final BufferedImage INFORMATION = loadImg ("/imgs/information.png");

	private MaterialImages () {}

	private static BufferedImage loadImg (String imgPath) {
		try (InputStream inputStream = MaterialImages.class.getResourceAsStream (imgPath)) {
			return ImageIO.read (inputStream);
		}
		catch (IOException e) {
			e.printStackTrace ();
			throw new RuntimeException ("Image " + imgPath + " wasn't loaded");
		}
	}
}
