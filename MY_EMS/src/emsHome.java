import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class emsHome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					emsHome window = new emsHome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public emsHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setLocationRelativeTo(null);
		frame.setBounds(100, 100, 1408, 936);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel pnlMenuleft = new JPanel();
		pnlMenuleft.setBounds(0, 63, 230, 846);
		pnlMenuleft.setBackground(new Color(0, 23, 48));
		frame.getContentPane().add(pnlMenuleft);
		pnlMenuleft.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 110, 230, 58);
		panel_1.setBackground(new Color(0, 23, 48));
		pnlMenuleft.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 10, 44, 48);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ricog\\git\\MY_EMS_JAVA\\MY_EMS\\icons\\outline_home_white_36dp.png"));

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1394, 63);
		panel.setBackground(new Color(20, 61, 89));
		frame.getContentPane().add(panel);
	}

}
