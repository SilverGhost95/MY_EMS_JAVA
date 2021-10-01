import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;

public class splash_Login {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					splash_Login window = new splash_Login();
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
	public splash_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelSplash = new JPanel();
		panelSplash.setBackground(new Color(244, 180, 26));
		panelSplash.setForeground(Color.WHITE);
		panelSplash.setBounds(0, 0, 458, 500);
		frame.getContentPane().add(panelSplash);
		panelSplash.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBorder(null);
		lblLogo.setBounds(116, 152, 211, 187);
		panelSplash.add(lblLogo);
		ImageIcon icon = new ImageIcon("C:\\Users\\ricog\\git\\MY_EMS_JAVA\\MY_EMS\\icons\\logo.png");
		//scale image to fit label
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblLogo.setIcon(scaledIcon);
		
		
		JPanel panelLogin = new JPanel();
		panelLogin.setBackground(new Color(20, 61, 89));
		panelLogin.setBounds(455, 0, 458, 500);
		frame.getContentPane().add(panelLogin);
		panelLogin.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtUsername.setText("Username");
		txtUsername.setForeground(new Color(255, 255, 255));
		txtUsername.setBackground(new Color(20, 61, 89));
		txtUsername.setBounds(101, 134, 290, 40);
		panelLogin.add(txtUsername);
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setFont(new Font("SansSerif", Font.PLAIN, 12));
		pwdPassword.setForeground(new Color(255, 255, 255));
		pwdPassword.setText("Password");
		pwdPassword.setBackground(new Color(20, 61, 89));
		pwdPassword.setBounds(101, 200, 290, 40);
		panelLogin.add(pwdPassword);
	}
}
