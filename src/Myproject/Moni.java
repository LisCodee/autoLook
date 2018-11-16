package Myproject;
import java.awt.Robot;
import java.awt.event.InputEvent;
public class Moni {
	public void moni(int location_x,int location_y) {
		try {
			Robot robot = new Robot();
			robot.setAutoWaitForIdle(true);	
			robot.mouseMove(location_x, location_y);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			System.out.println("°´ÏÂ×ó¼ü");
			robot.delay(100);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			System.out.println("ËÉ¿ª×ó¼ü");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
