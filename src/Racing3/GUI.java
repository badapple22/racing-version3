package Racing3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {
	JFrame jframe;	//창
	JPanel car_Panel;	//차량 공간
	JPanel car_Panel2;
	PlayerController ctr;
	JLabel background;
	JLabel score;
	JLabel score_v;
	
	int speed;
	int width;
	int height;
	int s_val = 0;

	
	public GUI() {
		speed = 20;
		width = 500;
		height = 800;
		
		ctr = new PlayerController(this);
		initGUI();
		
	}
	
	public void initGUI() {
		int s_val = 0;
		jframe = new JFrame("Car Racing");
		jframe.setLayout(null);
		background = new JLabel("", new ImageIcon("bgg.gif"),JLabel.CENTER);	//생동감 증가 필요
		background.setBounds(0,0,width,height);
		
		jframe.add(background);
		car_Panel = new JPanel();
		car_Panel.setSize(80, 70);	//차량공간 크기
		
		car_Panel2 = new JPanel();
		car_Panel2.setSize(80, 70);	//차량공간 크기
		

		//이미지 받기
		//label -> panel
		JLabel RaceCar = new JLabel(new ImageIcon("car2.png"));
		JLabel RaceCar2 = new JLabel(new ImageIcon("car1.png"));

		JLabel score = new JLabel("score:");
		JLabel score_v = new JLabel("1234");
		
		
		score.setBounds(210, 10, 122, 30);
		score_v.setBounds(250, 10, 122, 30);
		car_Panel.add(RaceCar);
		car_Panel.setLocation(100, 700);	//차위치
		Color cagBg = Color.decode("#7F7F7F");
		
		car_Panel2.setBackground(cagBg);
		background.add(car_Panel);	//도로위에 차놓기
		car_Panel2.add(RaceCar2);
		car_Panel2.setLocation(160, 550);	//차위치
		Color cagBg2 = Color.decode("#7F7F7F");
		car_Panel.setBackground(cagBg2);
		car_Panel2.setBackground(cagBg2);

		background.add(car_Panel);	//도로위에 차놓기
		background.add(car_Panel2);
		background.add(score);
		background.add(score_v);
		jframe.setSize(width, height);	//창 크기
		jframe.setVisible(true);
		jframe.setResizable(false);	//창 크기 변경X
		jframe.setLocationRelativeTo(null);
		jframe.addKeyListener(ctr);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("Helllo word");
		for(;;) {	//점수
			s_val++;
			score_v.setText(s_val + " ");
			try	//딜레이
			{
				
				TimeUnit.MILLISECONDS.sleep(s_val);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
		
	


//차패널 gif로 교체
//도로  gif5개의 사진으로 제작
//점수추가
//첨수판 추가	->거리
//사용자 이름받고 점수 할당
//부스터 추가
//컴퓨터 추가
//2인?
	//라벨로 바꾸기



}
