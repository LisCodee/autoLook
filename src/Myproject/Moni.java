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
			System.out.println("�������");
			robot.delay(100);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			System.out.println("�ɿ����");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
