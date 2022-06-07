import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class SliderChangeListener implements ChangeListener {
	JLabel label;
	
	public SliderChangeListener(JLabel label) {
		this.label = label;
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider slider = (JSlider)e.getSource();
		label.setText("Value: " + slider.getValue());
	}

}

public class SliderFrame3 extends JFrame {
	JPanel panel = new JPanel(new BorderLayout());
	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);
	JLabel label = new JLabel("Value: ", JLabel.CENTER);
	
	public SliderFrame3(String name) {
		super(name);
		this.add(panel);
		// event listener using outer class
		slider.addChangeListener(new SliderChangeListener(label)); // outer class
		panel.add(slider, BorderLayout.CENTER);
		panel.add(label, BorderLayout.SOUTH);
		
		this.setSize(250, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
