package Myproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class shuakeLunch {
	public void huida() {
		PrintScreen pr = new PrintScreen();	
		pr.jietu(470,361,275,74);
		zfbj bj = new zfbj();
		float percent = bj.compare(bj.getData("F:/workspace/jvmshuake/src/images/image.jpg"),
                bj.getData("F:/workspace/jvmshuake/src/images/��������.jpg"));
		System.out.println("ͼƬ���ƶ��ǣ�"+ percent);
		try {
			Robot robot = new Robot();
			robot.setAutoWaitForIdle(true);	
			for(int i = 0;i<5;i++) {		//У׼��꽹��
				robot.mouseMove(763, 602);
			}
			for(int i = 0;i<5;i++) {		//У׼��꽹��
				robot.mouseMove(778, 613);
			}
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(percent > 25) {
			try {
				try {
					Robot robot1 = new Robot();
					robot1.setAutoWaitForIdle(true);	
					for(int i = 0;i<5;i++) {		//У׼��꽹��
						robot1.mouseMove(498, 425);
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					System.out.println("�ش�������");
					robot1.delay(500);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					for(int i = 0;i<5;i++) {		//У׼��꽹��
						robot1.mouseMove(495, 438);
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					System.out.println("�ش�������");
					robot1.delay(500);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					System.out.println("�ش�������");
					for(int i=0;i<5;i++) {
						robot1.mouseMove(530, 502);					//�ƶ���ȷ����ť
					}
					Thread.sleep(1000);
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					robot1.delay(300);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					System.out.println("�ش�������");
				}catch(Exception e) {
					e.printStackTrace();
				}	
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("�ش�������");
		}
	}
	/*public void huida() {
		PrintScreen pr = new PrintScreen();	
		pr.jietu(470,361,70,45);
		bijiao bj = new bijiao();
		int baifen = bj.compareImage("F:/workspace/jvmshuake/src/images/image.jpg", "F:/workspace/jvmshuake/src/images/��������.jpg");
		if(baifen > 90) {
			try {
				try {
					Robot robot1 = new Robot();
					robot1.setAutoWaitForIdle(true);	
					for(int i = 0;i<5;i++) {		//У׼��꽹��
						robot1.mouseMove(498, 421);
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					System.out.println("�������");
					robot1.delay(100);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					for(int i=0;i<5;i++) {
						robot1.mouseMove(530, 502);					//�ƶ���ȷ����ť
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					robot1.delay(100);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					System.out.println("�ɿ����");
				}catch(Exception e) {
					e.printStackTrace();
				}	
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("���ƶȴ��ڰٷ�֮��ʮhuida");
		}else {
			System.out.println("���ƶ�С�ڰٷ�֮��ʮhuida");
		}
	}*/
	public void huidacuowu() {
		PrintScreen pr = new PrintScreen();	
		pr.jietu(738,470,451,179);
		bijiao bj = new bijiao();
		int baifen = bj.compareImage("F:/workspace/jvmshuake/src/images/image.jpg", "F:/workspace/jvmshuake/src/images/�ش����.jpg");
		if(baifen > 90) {
			try {
				try {
					Robot robot1 = new Robot();
					robot1.setAutoWaitForIdle(true);	
					for(int i=0;i<5;i++) {
						robot1.mouseMove(987, 636);			
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					System.out.println("ִ���˻ش����");
					robot1.delay(100);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					for(int i=0;i<5;i++) {
						robot1.mouseMove(1051, 611);			
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					System.out.println("ִ���˻ش����");
					robot1.delay(100);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					System.out.println("ִ���˻ش����");
					Thread.sleep(500);
					for(int i = 0;i<5;i++) {		//У׼��꽹��
						robot1.mouseMove(496, 458);
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					robot1.delay(100);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					for(int i = 0;i<5;i++) {		//У׼��꽹��
						robot1.mouseMove(496, 473);
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					robot1.delay(100);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					System.out.println("ִ���˻ش����");
					for(int i=0;i<5;i++) {
						robot1.mouseMove(521, 514);					//�ƶ���ȷ����ť
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					robot1.delay(100);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					System.out.println("�ش����");
				}catch(Exception e) {
					e.printStackTrace();
				}	
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public boolean rwwc(int x,int y,int x_z,int y_z) {
		PrintScreen pr = new PrintScreen();	
		pr.jietu(460,331,122,24);
		zfbj bj = new zfbj();
		float percent = bj.compare(bj.getData("F:/workspace/jvmshuake/src/images/image.jpg"),
                bj.getData("F:/workspace/jvmshuake/src/images/�������.jpg"));
		System.out.println("ͼƬ���ƶ��ǣ�"+ percent);
		if(percent >= 60) {
			try {
				try {
					Robot robot1 = new Robot();
					robot1.setAutoWaitForIdle(true);	
					if(y>1035) {
						for(int i=0;i<5;i++) {
							robot1.mouseMove(1897, 1036);							
						}
							robot1.mousePress(InputEvent.BUTTON1_MASK);
							robot1.delay(100);
							robot1.mouseRelease(InputEvent.BUTTON1_MASK);
							System.out.println("�������");
						Thread.sleep(3000);
					}
					for(int i=0;i<5;i++) {
						robot1.mouseMove(x, y);						
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					robot1.delay(300);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					System.out.println("�������");
					System.out.println(x);
					System.out.println(y);
					Thread.sleep(3000);
					for(int i=0;i<5;i++) {
						robot1.mouseMove(779, 258);						
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					robot1.delay(300);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					Thread.sleep(2000);
					for(int i=0;i<5;i++) {
						robot1.mouseMove(x_z, y_z);						
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					robot1.delay(300);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					return true;
				}catch(Exception e) {
					e.printStackTrace();
				}	
			}catch(Exception e){
				e.printStackTrace();
			}
		}else {
			return false;
		}
	return false;
	}
}
