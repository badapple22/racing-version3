package Racing3;

import javax.swing.*;
import java.awt.event.*;

import Racing3.BackgroundImage.BackgroundImage;
import Racing3.Car.Citizen;
import Racing3.Car.Player;
import Racing3.Input.Input;
import Racing3.Input.InputDelegate;
import Racing3.Menu.Menu;
import Racing3.Menu.MenuDelegate;


public class Run extends JFrame implements InputDelegate, ActionListener, MenuDelegate{
	public static String RESOURCE_PATH = "app/src/main/resources/";

	BackgroundImage bg;
	Player player;
	Input input = new Input();

	Menu menu;

	JPanel old = new JPanel();

	boolean gameOver = false;

	int sizeX;
	int sizeY;

	void playGame(){
		getContentPane().removeAll();
		bg = new BackgroundImage();
		player = new Player(100, 600, "player");
		Citizen citizen1 = new Citizen(100, 0, "citizen"){
			@Override
			public void run() {
				while (!gameOver) {
					try{
						Thread.sleep(bg.timeInterval);
					} catch(InterruptedException exception) {
						exception.printStackTrace();
					}
					if( point.y + iconHeight > sizeY){
						point.y = 0;
					}
					point.y += 50;
					setBounds(point.x, point.y, iconWidth, iconHeight);
				}
			};
		};
		Citizen citizen2 = new Citizen(300, 100, "citizen"){
			@Override
			public void run() {
				while (!gameOver) {
					try{
						Thread.sleep(bg.timeInterval);
					} catch(InterruptedException exception) {
						exception.printStackTrace();
					}
					if( point.y + iconHeight > sizeY){
						point.y = 0;
					}
					point.y += 50;
					setBounds(point.x, point.y, iconWidth, iconHeight);
				}
			}
		};
		bg.add(citizen1);
		bg.add(citizen2);
		add(bg);

		Thread thBg = new Thread(bg);
		Thread thCitizen1 = new Thread(citizen1);
		Thread thCitizen2 = new Thread(citizen2);


		thBg.start();
		thCitizen1.start();
		thCitizen2.start();



		revalidate();
	}

	void backToMenu(){
		getContentPane().removeAll();
		
		old = menu;
		add(menu);
		revalidate();
	}

	Run(int width, int height){
		
		input.start();
		input.delegate = this;
		addKeyListener(input);


		menu = new Menu();
		menu.delegate = this;
		
		this.sizeX = width;
		this.sizeY = height;
		setSize(width, height);

		JButton reset = new JButton("rest");
		reset.setBounds(100, 200, 100, 100);
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				backToMenu();
			}
		});
		old.add(reset);
		old.setLayout(getLayout());
		backToMenu();
		
	

		setVisible(true);

	}

	@Override
	public void fast() {
		if (bg.timeInterval == 0){
			            return;
			        }
			        System.out.println("go fast: " + bg.timeInterval);
			        if(bg.timeInterval < 1000){
			            bg.timeInterval -= 50;
			            return;
			        }
			        if(bg.timeInterval < 500){
			            bg.timeInterval -= 10;
			            return;
			        }
			        bg.timeInterval -= 100;
	}

	@Override
	public void slow() {
		System.out.println("go slow: " + bg.timeInterval ) ;
        bg.timeInterval += 100;
	}

	@Override
	public void moveLeft() {
		player.point.x -= 10;
	}

	@Override
	public void moveRight() {
		player.point.y -= 10;
	}


	public static void main(String[] args) {
		new Run(600, 800);
	}

	public void actionPerformed(ActionEvent e) {
		String type = e.getActionCommand();
		System.out.println(type);
		switch (type) {
			case "reset":
				backToMenu();
				break;
			case "start":
				System.out.println("start");
				break;
			case "score":
			System.out.println("score");
			default:
				break;
		}
	}

	@Override
	public void start() {
		playGame();
	}

	@Override
	public void score() {
		System.out.println("score");
	}
}
