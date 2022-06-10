import javax.swing.*;

public class MyFrame extends JFrame {

	public MyFrame() {
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		JLabel label1 = new JLabel("welcome to java pizza world!");
		panelA.add(label1);
		JButton button1 = new JButton("combo pizza");
		JButton button2 = new JButton("pineapple pizza");
		JButton button3 = new JButton("tomato pizza");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		JLabel lable2 = new JLabel("°³¼ö");
		JTextField field1 = new JTextField(10);
		panelB.add(lable2);
		panelB.add(field1);
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
	}
	
}
