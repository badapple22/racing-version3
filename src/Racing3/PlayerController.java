package Racing3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

public class PlayerController implements KeyListener, ActionListener{
	GUI g;
	private Timer timer;
	
	public PlayerController(GUI ref) {
		this.g = ref;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//37왼쪽, 39오른쪽
		int code = e.getKeyCode();
		if(code==37) {	//왼쪽이동
			int x = g.car_Panel.getX();
			int y = g.car_Panel.getY();
			if(x-g.speed>=0) {
				g.car_Panel.setLocation(x-g.speed, y);	//왼쪽키가 눌리면 x값 감소, 프레임 바깥으로 못나감
			}
			

		}
		else if (code==39) {	//오른쪽이동
			int x = g.car_Panel.getX();
			int y = g.car_Panel.getY();
			int width = g.jframe.getWidth();
			int carWidth = g.car_Panel.getWidth();
			if(x+g.speed + carWidth <=width) {
				g.car_Panel.setLocation(x+g.speed, y);	//오른쪽키가 눌리면 x값 증가, 프레임 바깥으로 못나감
			}

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
