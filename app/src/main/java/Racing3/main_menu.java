package Racing3;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;

import Racing3.Menu;

class Menu extends JFrame implements ActionListener {
	
	List<JLabel> labels;
	List<JButton> buttons;
	public Menu() {
		JPanel panel = new JPanel();
		this.setSize(500, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("레이싱 게임");
		setLabel(panel);
		setButtons(panel);
		this.add(panel);
		this.setVisible(true);
		
	}

	void setLabel(JPanel panel){
		JLabel title = new JLabel("Racing Game");
		title.setBounds(190, 250, 250, 30);
		title.setFont(new Font("serif", Font.BOLD, 21));
		panel.add(title);
	}

	void setButtons(JPanel panel){
		JButton startButton = new JButton("start");
		startButton.setFont(new Font("serif", Font.CENTER_BASELINE, 30));
		startButton.setBounds(190, 400, 122, 40);
		startButton.addActionListener(this);
		panel.add(startButton);

		JButton scoreButton = new JButton("score");
		scoreButton.setBounds(190, 500, 122, 40);
		scoreButton.setFont(new Font("serif", Font.CENTER_BASELINE, 30));
		scoreButton.addActionListener(this);
		panel.add(scoreButton);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonType = e.getSource().toString();

		switch (buttonType) {
			case "startButton":
				System.out.println("Start button");;
				break;
			case "scoreButton":
				System.out.println("score button");
				break;
			default:
				break;
		}
		
	}
}
public class main_menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Menu();

	}

}

//라벨 리스트, add함수, panel함수
//setbound 함수
