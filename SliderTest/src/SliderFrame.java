import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame extends JFrame implements ChangeListener{

	JPanel panel = new JPanel(new BorderLayout());
	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);
	JLabel label = new JLabel("Value : ", JLabel.CENTER);
	
	class SliderChangeListener1 implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {
			JSlider slider = (JSlider)e.getSource();
			label.setText("Value : " + slider.getValue());
		}	
	}
	
	public SliderFrame(String name) {
		super(name);
		this.add(panel);
		slider.addChangeListener(new SliderChangeListener(label));
		// slider.addChangeListener(new SliderChangeListener1());
		// slider.addChangeListener(this);
		panel.add(slider, BorderLayout.CENTER);
		panel.add(label, BorderLayout.SOUTH);
		
		this.setSize(250, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SliderFrame("Slider Frame");
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider slider = (JSlider)e.getSource();
		label.setText("Value : " + slider.getValue());
	}

}
