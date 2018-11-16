package Myproject;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
 
public class PrintScreen {
	public  void jietu(int x_t,int y_t,int x_b,int y_b) {
		try {
			Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle screenRectangle = new Rectangle(dimension);
			Robot robot = new Robot();
			BufferedImage image = robot.createScreenCapture(screenRectangle);
			System.out.println(dimension.getHeight());
			System.out.println(dimension.getWidth());
			File file = new File("F:/workspace/jvmshuake/src/images/image.jpg");
			// 指定屏幕区域，参数为截图左上角坐标(100,100)+右下角坐标(500,500)
			BufferedImage subimage = image.getSubimage(x_t, y_t, x_b, y_b);
			ImageIO.write(subimage, "jpg", file);
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
