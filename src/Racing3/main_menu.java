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
	JPanel panel = new JPanel();
	public Menu() {
		this.setSize(500, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("레이싱 게임");
		
		for(int i = 0; i < 2; i++) {
			add_label(labels);
		}
		
		for(int i = 0; i < 2; i++) {
			add_button(buttons);
		}
		labels = (List<JLabel>) new JLabel("Racing Game");
		((JComponent) labels).setForeground(Color.green);
		((JComponent) labels).setFont(new Font("Serif", Font.BOLD, 21));
		labels = (List<JLabel>) new JLabel("", new ImageIcon("menu_bg.png"),JLabel.CENTER);	
		((AbstractButton) buttons).addActionListener(this);		//?
		label_bounds(labels, 0,0,500,800);	//배경
		((AbstractButton) buttons).addActionListener(this);		//?
		label_bounds(labels,190, 250, 122, 30);	//제목
		button_bounds(buttons, 190, 400, 122, 30);
		button_bounds(buttons, 190, 500, 122, 30);
		addComponents(labels, buttons, panel);
		this.add(panel);
		this.setVisible(true);
		
	}
	
	void add_label(List<JLabel> labels) {	//label add해주는함수
		labels.add(new JLabel());
	}
	
	void add_button(List<JButton> buttons) {	//button add해주는함수
		buttons.add(new JButton());
	}
	
	void label_bounds(List<JLabel> labels, int x, int y, int width, int height) {
		((Component) labels).setBounds(x, y, width, height);
		//label setbounds해주는함수
	}
	
	void button_bounds(List<JButton> buttons, int x, int y, int width, int height) {
		((Component) buttons).setBounds(x, y, width, height);
		//button setbounds해주는함수
	}
	
	JPanel setPanel(JPanel panel, int x, int y, int width, int height){
		//name.setBounds(x, y, width, height);
		return null;
		//setbounds 까지
		
	}

	JButton setButton(List<JButton> buttons, ActionListener ac){
		//buttons.ac(this);
		return null;
		//addActionListener 까지
	}

	void addComponents(List<JLabel> labels, List<JButton> buttons, JPanel panel){
		panel.setLayout(null);	//add panel 함수
		panel.add((Component) buttons);
		panel.add((Component) labels);
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

//라벨 리스트, add함수, panel함수
//setbound 함수
