package Myproject;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class test extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame fr = new JFrame("程序窗口");
		Container container = fr.getContentPane();
		JLabel jl = new JLabel("需要结束程序请直接关闭,运行后请最小化");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.WHITE);
		fr.setVisible(true);
		fr.setSize(300, 500);
		fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		int x = 1686,y = 137;
		final int x_z = 778 ,y_z = 613;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for(;;) {
			shuakeLunch sk = new shuakeLunch();
			if(y>1040)
				y = 137;
			if(sk.rwwc(x,y,x_z,y_z)) {
				y += 25;
			}
			sk.huida();	
			sk.huidacuowu();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

