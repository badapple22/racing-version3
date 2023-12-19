package Racing3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Menu extends JFrame implements ActionListener {

	List<JLabel> labels;
	List<JButton> buttons;

	
	public Menu() {
		this.setSize(500, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("레이싱 게임");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		s_button = new JButton("Start");
		sc_button = new JButton("Score");
		label1 = new JLabel("test1");
		label2 = new JLabel("test6");
		label3 = new JLabel("Racing Game");
		label3.setForeground(Color.green);
		label3.setFont(new Font("Serif", Font.BOLD, 21));
		bg = new JLabel("", new ImageIcon("menu_bg.png"),JLabel.CENTER);	
		bg.setBounds(0,0,500,800);

		s_button.addActionListener(this);
		sc_button.addActionListener(this);
		label1.setBounds(210, 450, 122, 30);
		label2.setBounds(210, 550, 122, 30);
		label3.setBounds(190, 250, 122, 30);
		s_button.setBounds(190, 400, 122, 30);
		sc_button.setBounds(190, 500, 122, 30);

		panel.add(s_button);
		panel.add(sc_button);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(bg);
		this.add(panel);
		this.setVisible(true);
	}

	JPanel setPanel(String name, int x, int y, int width, int height){
		//setbounds 까지
	}

	JButton setButton(String name, ActionListener ac){
		//addActionListener 까지
	}

	void addComponents(List<JLabel> labels, List<JButton> buttons, JPanel panel){

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == s_button) 
		{
			//new GUI();
		}
		
		if(e.getSource() == sc_button) 
		{
			label2.setText("test7");
		}
	}
	
}

public class main_menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Menu m = new Menu();
	}

}
//라벨 리스트, add함수, panel함수
