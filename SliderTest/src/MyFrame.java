import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ButtonActionListener1 implements ActionListener {
	JLabel label;
	public ButtonActionListener1(JLabel label) {
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText("button clicked~~~~~~~~~~");
	}
}

public class MyFrame extends JFrame implements ActionListener {
	JPanel panel = new JPanel(new BorderLayout());
	JButton button = new JButton("button click");
	JLabel label = new JLabel("please click button", JLabel.CENTER);
	
	private class ButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("button clicked~~~!!");
		}
	}
	public MyFrame(String name) {
		super(name);
		panel.add(button, BorderLayout.NORTH);
		panel.add(label, BorderLayout.CENTER);
		this.add(panel);
		// event listener using this class
		//button.addActionListener(this);
		// event listener using anonymous class
		/*button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("button clicked!!");
			}
		});*/
		// event listener using anonymous class
		/*button.addActionListener(e -> {
				label.setText("button clicked!!");
		});*/
		// event listener using inner class
		//button.addActionListener(new ButtonActionListener());
		// event listener using outer class
		button.addActionListener(new ButtonActionListener1(label));
		this.setSize(250, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText("button clicked!!");
	}

}
