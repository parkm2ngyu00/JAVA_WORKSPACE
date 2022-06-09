import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class HealthCalculatorFrame extends JFrame implements ActionListener {

	JLabel[] labels = {
			new JLabel("Age"),
			new JLabel("Gender"), // radiobutton
			new JLabel("Weight"),
			new JLabel("Height"),
			new JLabel("Neck"),
			new JLabel("Waist"),
			new JLabel("Hip"),
			new JLabel("Activity"), // combobox
			new JLabel("BMI"),
			new JLabel("BFP"),
			new JLabel("BMR"),
			new JLabel("CI")
	};
	JTextField[] textfields = new JTextField[10];
	JPanel[] panels = new JPanel[13];
	JRadioButton[] rbuttons = new JRadioButton[2];
	ButtonGroup rgroup = new ButtonGroup();
	JPanel rpanel = new JPanel();
	JComboBox<String> combobox = new JComboBox<>(Activity.names());
	JButton button = new JButton("Health Calculate");
	JPanel panel = new JPanel();
	
	public HealthCalculatorFrame(String name) {
		super(name);
		
		for (int i = 0; i < textfields.length; i++) {
			textfields[i] = new JTextField(14);
		}
		for (int i = 0; i < panels.length; i++) {
			panels[i] = new JPanel(new GridLayout(0, 2));
		}
		rbuttons[0] = new JRadioButton("FEMALE", true);
		rbuttons[1] = new JRadioButton("MALE");
		
		// age
		panels[0].add(labels[0]);
		panels[0].add(textfields[0]);
		// gender
		rgroup.add(rbuttons[0]);
		rgroup.add(rbuttons[1]);
		rpanel.add(rbuttons[0]);
		rpanel.add(rbuttons[1]);	
		panels[1].add(labels[1]);
		panels[1].add(rpanel);
		// weight
		panels[2].add(labels[2]);
		panels[2].add(textfields[1]);
		// height
		panels[3].add(labels[3]);
		panels[3].add(textfields[2]);
		// neck
		panels[4].add(labels[4]);
		panels[4].add(textfields[3]);
		// waist
		panels[5].add(labels[5]);
		panels[5].add(textfields[4]);
		// hip
		panels[6].add(labels[6]);
		panels[6].add(textfields[5]);
		// activity
		panels[7].add(labels[7]);
		panels[7].add(combobox);
		// button
		panels[8].setLayout(new FlowLayout());
		panels[8].add(button);
		// BMI
		panels[9].add(labels[8]);
		panels[9].add(textfields[6]);
		// BFP
		panels[10].add(labels[9]);
		panels[10].add(textfields[7]);
		// BMR
		panels[11].add(labels[10]);
		panels[11].add(textfields[8]);
		// CI
		panels[12].add(labels[11]);
		panels[12].add(textfields[9]);
		// panel
		for (int i = 0; i < panels.length; i++) {
			panel.add(panels[i]);
		}
		this.add(panel);
		
		// event listener
		button.addActionListener(this);
		
		this.setSize(370, 470);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			int age = Integer.parseInt(textfields[0].getText());
			Gender gender = rbuttons[0].isSelected() ? Gender.FEMALE : Gender.MALE;
			double weight = Double.parseDouble(textfields[1].getText());
			double height = Double.parseDouble(textfields[2].getText());
			double neck = Double.parseDouble(textfields[3].getText());
			double waist = Double.parseDouble(textfields[4].getText());
			double hip = Double.parseDouble(textfields[5].getText());
			Activity activity = Activity.valueOf(combobox.getSelectedIndex());
			PersonData p = new PersonData(age, gender, weight, height, neck, waist, hip, activity);
			System.out.println(p);
			// BMI
			IHealthCalculator bmi = new BMICalculator();
			bmi.setDataInput(p);
			System.out.println(bmi);
			textfields[6].setText("" + String.format("%.2f", bmi.calculate()) + " " + BMI.getIndex(bmi.calculate()));
			// BFP
			IHealthCalculator bfp = new BFPCalculator();
			bfp.setDataInput(p);
			System.out.println(bfp);
			textfields[7].setText("" + String.format("%.2f", bfp.calculate()) + " " + BFP.getIndex(gender, bfp.calculate()));
			// BMR
			IHealthCalculator bmr = new BMRCalculator();
			bmr.setDataInput(p);
			System.out.println(bmr);
			textfields[8].setText("" + String.format("%.2f", bmr.calculate()));
			// CI
			IHealthCalculator ci = new CalorieIntakeCalculator();
			ci.setDataInput(p);
			System.out.println(ci);
			textfields[9].setText("" + String.format("%.2f", ci.calculate()));
		}
	}

	public static void main(String[] args) {
		new HealthCalculatorFrame("HealthCalculatorFrame");
	}
}
