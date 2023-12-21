package Racing3.Menu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Menu extends JPanel implements ActionListener{
	
	JLabel title;
	JButton startButton;
	JButton scoreButton;

	public MenuDelegate delegate;


	public Menu() {
		setLayout(null);
		setLabel();
		setButtons();
		
	}

	void setLabel(){
		JLabel t = new JLabel("Racing Game");
		this.title = t;
		title.setBounds(190, 250, 250, 30);
		title.setFont(new Font("serif", Font.BOLD, 21));
		add(title);
	}

	void setButtons(){
		JButton stb = new JButton("start");
		this.startButton = stb;
		startButton.setFont(new Font("serif", Font.CENTER_BASELINE, 30));
		startButton.setBounds(190, 400, 122, 40);
		startButton.addActionListener(this);
		add(startButton);

		JButton scb = new JButton("score");
		this.scoreButton = scb;
		scoreButton.setBounds(190, 500, 122, 40);
		scoreButton.setFont(new Font("serif", Font.CENTER_BASELINE, 30));
		scoreButton.addActionListener(this);
		add(scoreButton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String type = e.getActionCommand();
		System.out.println(type);
		switch (type) {
			case "start":
				delegate.start();
				break;
			case "score":
			delegate.score();
			default:
				break;
		}
	}
}