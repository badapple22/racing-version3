package Racing3.Car;


import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Racing3.Run;

public class Car extends JLabel {
	
	public Point point;

	public int iconWidth;
	public int iconHeight;
	ImageIcon icon;	
	String img_title;

	
	
	Car(int x, int y, String name) {
		point = new Point(x, y);
		icon = new ImageIcon(Run.RESOURCE_PATH + name + ".png");
		iconWidth = icon.getIconWidth();
		iconHeight = icon.getIconHeight();
		setIcon(icon);
		setBounds(x, y, iconWidth, iconHeight);
	}

}
