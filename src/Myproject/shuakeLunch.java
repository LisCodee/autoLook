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
                bj.getData("F:/workspace/jvmshuake/src/images/出现问题.jpg"));
		System.out.println("图片相似度是："+ percent);
		try {
			Robot robot = new Robot();
			robot.setAutoWaitForIdle(true);	
			for(int i = 0;i<5;i++) {		//校准鼠标焦点
				robot.mouseMove(763, 602);
			}
			for(int i = 0;i<5;i++) {		//校准鼠标焦点
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
					for(int i = 0;i<5;i++) {		//校准鼠标焦点
						robot1.mouseMove(498, 425);
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					System.out.println("回答了问题");
					robot1.delay(500);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					for(int i = 0;i<5;i++) {		//校准鼠标焦点
						robot1.mouseMove(495, 438);
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					System.out.println("回答了问题");
					robot1.delay(500);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					System.out.println("回答了问题");
					for(int i=0;i<5;i++) {
						robot1.mouseMove(530, 502);					//移动到确定按钮
					}
					Thread.sleep(1000);
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					robot1.delay(300);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					System.out.println("回答了问题");
				}catch(Exception e) {
					e.printStackTrace();
				}	
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("回答了问题");
		}
	}
	/*public void huida() {
		PrintScreen pr = new PrintScreen();	
		pr.jietu(470,361,70,45);
		bijiao bj = new bijiao();
		int baifen = bj.compareImage("F:/workspace/jvmshuake/src/images/image.jpg", "F:/workspace/jvmshuake/src/images/出现问题.jpg");
		if(baifen > 90) {
			try {
				try {
					Robot robot1 = new Robot();
					robot1.setAutoWaitForIdle(true);	
					for(int i = 0;i<5;i++) {		//校准鼠标焦点
						robot1.mouseMove(498, 421);
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					System.out.println("按下左键");
					robot1.delay(100);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					for(int i=0;i<5;i++) {
						robot1.mouseMove(530, 502);					//移动到确定按钮
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					robot1.delay(100);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					System.out.println("松开左键");
				}catch(Exception e) {
					e.printStackTrace();
				}	
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("相似度大于百分之五十huida");
		}else {
			System.out.println("相似度小于百分之五十huida");
		}
	}*/
	public void huidacuowu() {
		PrintScreen pr = new PrintScreen();	
		pr.jietu(738,470,451,179);
		bijiao bj = new bijiao();
		int baifen = bj.compareImage("F:/workspace/jvmshuake/src/images/image.jpg", "F:/workspace/jvmshuake/src/images/回答错误.jpg");
		if(baifen > 90) {
			try {
				try {
					Robot robot1 = new Robot();
					robot1.setAutoWaitForIdle(true);	
					for(int i=0;i<5;i++) {
						robot1.mouseMove(987, 636);			
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					System.out.println("执行了回答错误");
					robot1.delay(100);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					for(int i=0;i<5;i++) {
						robot1.mouseMove(1051, 611);			
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					System.out.println("执行了回答错误");
					robot1.delay(100);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					System.out.println("执行了回答错误");
					Thread.sleep(500);
					for(int i = 0;i<5;i++) {		//校准鼠标焦点
						robot1.mouseMove(496, 458);
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					robot1.delay(100);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					for(int i = 0;i<5;i++) {		//校准鼠标焦点
						robot1.mouseMove(496, 473);
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					robot1.delay(100);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					System.out.println("执行了回答错误");
					for(int i=0;i<5;i++) {
						robot1.mouseMove(521, 514);					//移动到确定按钮
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					robot1.delay(100);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					System.out.println("回答错误");
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
                bj.getData("F:/workspace/jvmshuake/src/images/完成任务.jpg"));
		System.out.println("图片相似度是："+ percent);
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
							System.out.println("任务完成");
						Thread.sleep(3000);
					}
					for(int i=0;i<5;i++) {
						robot1.mouseMove(x, y);						
					}
					robot1.mousePress(InputEvent.BUTTON1_MASK);
					robot1.delay(300);
					robot1.mouseRelease(InputEvent.BUTTON1_MASK);
					System.out.println("任务完成");
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
