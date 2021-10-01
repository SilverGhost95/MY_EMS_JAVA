import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JToolBar.Separator;
import javax.swing.JSeparator;

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
		frame.setBounds(400, 400, 900, 500);
		frame.setLocationRelativeTo(null);
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
		ImageIcon iconLogo = new ImageIcon("C:\\Users\\ricog\\git\\MY_EMS_JAVA\\MY_EMS\\icons\\logo.png");
		lblLogo.setIcon(scaleIcon(lblLogo,iconLogo));
		
		
		JPanel panelLogin = new JPanel();
		panelLogin.setBackground(new Color(20, 61, 89));
		panelLogin.setBounds(455, 0, 458, 500);
		frame.getContentPane().add(panelLogin);
		panelLogin.setLayout(null);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(101, 177, 290, 10);
		panelLogin.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBackground(Color.WHITE);
		separator_1.setBounds(101, 258, 290, 40);
		panelLogin.add(separator_1);
		

		
		txtUsername = new JTextField();
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtUsername.setText("Username");
		txtUsername.setForeground(new Color(255, 255, 255));
		txtUsername.setBackground(new Color(20, 61, 89));
		txtUsername.setBounds(101, 139, 290, 39);
		panelLogin.add(txtUsername);
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBorder(null);
		pwdPassword.setFont(new Font("SansSerif", Font.PLAIN, 18));
		pwdPassword.setForeground(new Color(255, 255, 255));
		pwdPassword.setText("Password");
		pwdPassword.setBackground(new Color(20, 61, 89));
		pwdPassword.setBounds(101, 220, 290, 39);
		panelLogin.add(pwdPassword);
		
		Button btnNewButton = new Button("Sign In");
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(20, 61, 89));
		//btnNewButton.setBorder(BorderFactory.createEmptyBorder());
		btnNewButton.setBounds(101, 300, 123, 40);
		panelLogin.add(btnNewButton);
		
		Button btnRegister = new Button("Register");
		btnRegister.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnRegister.setForeground(new Color(255, 255, 255));
		btnRegister.setBackground(new Color(20, 61, 89));
		btnRegister.setBounds(268, 300, 123, 40);
		panelLogin.add(btnRegister);
		
		JLabel lblNewLabel = new JLabel("Forgot Password?");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(179, 390, 135, 26);
		panelLogin.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("");
		lblUsername.setBounds(67, 144, 30, 30);
		panelLogin.add(lblUsername);
		ImageIcon iconUser = new ImageIcon("C:\\Users\\ricog\\git\\MY_EMS_JAVA\\MY_EMS\\icons\\account.png");
		lblUsername.setIcon(scaleIcon(lblUsername, iconUser));
		
		JLabel lblPassword = new JLabel("");
		lblPassword.setBounds(67, 224, 30, 30);
		panelLogin.add(lblPassword);
		ImageIcon iconPassword = new ImageIcon("C:\\Users\\ricog\\git\\MY_EMS_JAVA\\MY_EMS\\icons\\lock.png");
		lblPassword.setIcon(scaleIcon(lblPassword,iconPassword));

	}
	
	
	private ImageIcon scaleIcon(JLabel label, ImageIcon icon) {

		Image img = icon.getImage();
		Image imgScaled = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon iconScaled = new ImageIcon(imgScaled);
		return iconScaled;
	}


}
