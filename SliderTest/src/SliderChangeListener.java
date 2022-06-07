import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// outer class event listener
public class SliderChangeListener implements ChangeListener {

	JLabel label;
	
	public SliderChangeListener(JLabel label) {
		this.label = label;
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider slider = (JSlider)e.getSource();
		label.setText("Value : " + slider.getValue());
	}
	
}
