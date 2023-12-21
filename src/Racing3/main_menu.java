package Racing3;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Racing3.Menu;

class Menu extends JFrame implements ActionListener {
	
	List<JLabel> labels;
	List<JButton> buttons;
	
	public Menu() {
		this.setSize(500, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Racing Game");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		for(int i = 0; i < 2; i++) {
			add_label(labels);
		}
		
		for(int i = 0; i < 2; i++) {
			add_button(buttons);
		}
		
		
	}
	
	void add_label(List<JLabel> labels) {	//label add해주는함수
		labels.add(new JLabel());
	}
	
	void add_button(List<JButton> buttons) {	//button add해주는함수
		buttons.add(new JButton());
	}
	
	void addComponents(List<JLabel> labels, List<JButton> buttons, JPanel panel){
		int labelSize = labels.size();
		int buttonSize = buttons.size();
		for(int i = 0; i < labelSize; i++) {
			panel.add(labels.get(i));
		}
		for(int i = 0; i < buttonSize; i++) {
			panel.add(buttons.get(i));
		}
	}
	
	void label_bounds(JLabel label, int x, int y, int width, int height) {
		label.setBounds(x, y, width, height);
		//label setbounds해주는함수
	}
	
	void button_bounds(JButton button, int x, int y, int width, int height) {
		button.setBounds(x, y, width, height);
		//button setbounds해주는함수
	}
	
	/*
	JPanel setPanel(List<JLabel>, int x, int y, int width, int height){
		//name.setBounds(x, y, width, height);
		//for문
		return null;
		//setbounds 까지
		
	}
	*/

	void setButton(JButton button){
		button.addActionListener(this);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
public class main_menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu m = new Menu();
	}

}
//상대방 생성
// 충돌
// 
//라벨 리스트, add함수, panel함수
//setbound 함수
