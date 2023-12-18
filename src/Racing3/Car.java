package Racing3;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Car {
	
	int x;	//이미지 좌표
	int y;
	Image image;	
	String img_title;	//이미지 파일 이름

	
	class Point {
		 int x;
		 int y;
		 public Point(int x, int y) {
			 this.x = x;
			 this.y = y;
			 
		 }
	 }
	
	Car(int x, int y, String path) {
		 this.x = x;
		 this.y = y;
		 image = new ImageIcon(path).getImage();
	 }
	
}
