import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame4 extends JFrame {
	JPanel panel = new JPanel(new BorderLayout());
	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);
	JLabel label = new JLabel("Value: ", JLabel.CENTER);
	
	public SliderFrame4(String name) {
		super(name);
		this.add(panel);
		// event listener using anonymous class
		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				//JSlider slider = (JSlider)e.getSource();
				label.setText("Value: " + slider.getValue());
			}
			
		});
		panel.add(slider, BorderLayout.CENTER);
		panel.add(label, BorderLayout.SOUTH);
		
		this.setSize(250, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
