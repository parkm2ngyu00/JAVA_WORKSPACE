import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame7 extends JFrame implements ChangeListener, ActionListener {
	JPanel panel = new JPanel(new FlowLayout());
	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
	JLabel label = new JLabel("Value: ", JLabel.CENTER);
	JTextField textfield = new JTextField("0", 15);
	JButton button = new JButton("Close");

	public SliderFrame7(String name) {
		super(name);
		panel.add(slider);
		panel.add(label);
		panel.add(textfield);
		panel.add(button);
		this.add(panel);
		// event listener using this class
		slider.addChangeListener(this); 
		button.addActionListener(this);
		textfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_ENTER) {
				    System.out.println("ENTER pressed");
				    JTextField textfield = (JTextField) e.getSource();
			  		int value = Integer.parseUnsignedInt(textfield.getText()); // String -> int
			  		slider.setValue(value);
			   	}
			}
		});
		
		this.setSize(250, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		textfield.setText("" + slider.getValue());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
}
