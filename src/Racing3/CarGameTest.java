package Racing3;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class MyPanel extends JLabel {
	BufferedImage img = null;
	int img_x = 100, img_y = 600;
	
	public MyPanel() {
		try {
			img = ImageIO.read(new File("car2.png"));
		} catch (IOException e) {
			System.out.println("no image");
			System.exit(1);
		}
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keycode = e.getKeyCode();
				switch(keycode) {
				case KeyEvent.VK_LEFT: img_x -= 10; break;
				case KeyEvent.VK_RIGHT: img_x += 10; break;
				case KeyEvent.VK_UP: img_y -= 10; break;
				case KeyEvent.VK_DOWN: img_y += 10; break;
				}
				repaint();
			}
			@Override
			public void keyReleased(KeyEvent e) {}
		});
		this.requestFocus();
		setFocusable(true);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
	
}


public class CarGameTest extends JFrame{
	
	class MyThread extends Thread {
		private JLabel label;
		public static int x;
		public static int y;
		
		public MyThread(String fname, int x, int y) {
			this.x = x;
			this.y = y;
			label = new JLabel();
			label.setIcon(new ImageIcon(fname));
			label.setBounds(x, y, 100, 100);
			add(label);
		}
		public void run() {
			for (int i = 0; i < 200; i++) {
				y += 10 * Math.random();
				label.setBounds(x, y, 100, 100);
				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public CarGameTest() {
		
		setTitle("CarGameTest");
		setSize(500, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		(new MyThread("car1.png", 100, 0)).start();
		(new MyThread("car1.png", 300, 100)).start();
		add(new MyPanel());
		setVisible(true);
		int img_x = 100;
		int img_y = 600;
		crash(img_x, img_y, MyThread.x, MyThread.y, 100, 100, 100, 100);
	}
	
	boolean crash(int x1, int y1, int x2, int y2,
			int w1, int h1, int w2, int h2) {
		
		boolean check = false;
		
		if(x1 > x2 && x1 < x2 + w1
				&& y1 > y2 && y1 < y2 + h1 ) {
			check = true;
			System.out.println("crash!!");
		}
		return check;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarGameTest s = new CarGameTest();
	}

}