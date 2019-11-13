package laba_17;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
public class Main extends JFrame {
 private JLabel label;
 private JPanel panel;
 private JButton button1;
 public Main() {
 super("Test frame");
 createGUI();
 }
 public void createGUI() {
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 panel = new JPanel();
 panel.setLayout(new FlowLayout());
 button1 = new JButton("Button 1");
 button1.setActionCommand("l");
 panel.add(button1);
 label = new JLabel("SSS", JLabel.CENTER);
 panel.add(label);
 label.setSize(100, 100);
 label.setLocation(320, 100);
 label.setBackground(Color.green);


 ActionListener actionListener = new TestActionListener();

 button1.addActionListener(actionListener);
 
 
 getContentPane().add(panel);
 setPreferredSize(new Dimension(320, 100));
 }

 public class TestActionListener implements ActionListener {
 public void actionPerformed(ActionEvent e) {
 if(e.getActionCommand() == "l") {
	 System.out.println("TRUE");
 label.setBackground(Color.green);
 label.setText("CCC");
 button1.setBackground(Color.green);
 }
 }
 }
 public static void main(String[] args) {
 javax.swing.SwingUtilities.invokeLater(new Runnable() {
 public void run() {
 JFrame.setDefaultLookAndFeelDecorated(true);
Main frame = new Main();
frame.pack();
 frame.setLocationRelativeTo(null);
 frame.setVisible(true);
 }
 });
 }
}
