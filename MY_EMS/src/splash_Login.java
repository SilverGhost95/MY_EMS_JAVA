import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

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
		lblLogo.setIcon(scaleIcon(lblLogo, iconLogo));

		JPanel panelLogin = new JPanel();
		panelLogin.setBackground(new Color(20, 61, 89));
		panelLogin.setBounds(455, 0, 445, 500);
		frame.getContentPane().add(panelLogin);
		panelLogin.setLayout(null);

		JSeparator sptrUsername = new JSeparator();
		sptrUsername.setBounds(101, 177, 290, 10);
		panelLogin.add(sptrUsername);

		JSeparator sptrPassword = new JSeparator();
		sptrPassword.setForeground(Color.LIGHT_GRAY);
		sptrPassword.setBackground(Color.WHITE);
		sptrPassword.setBounds(101, 258, 290, 10);
		panelLogin.add(sptrPassword);

		txtUsername = new JTextField();
		txtUsername.setBorder(null);
		txtUsername.setCaretColor(Color.WHITE);
		txtUsername.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtUsername.setText("Username");
		txtUsername.setForeground(new Color(255, 255, 255));
		txtUsername.setBackground(new Color(20, 61, 89));
		txtUsername.setBounds(101, 139, 290, 39);
		panelLogin.add(txtUsername);
		txtUsername.setColumns(10);

		pwdPassword = new JPasswordField();
		pwdPassword.setBorder(null);
		pwdPassword.setCaretColor(Color.WHITE);
		pwdPassword.setFont(new Font("SansSerif", Font.PLAIN, 18));
		pwdPassword.setForeground(new Color(255, 255, 255));
		pwdPassword.setText("Password");
		pwdPassword.setBackground(new Color(20, 61, 89));
		pwdPassword.setBounds(101, 220, 290, 39);
		panelLogin.add(pwdPassword);

		Button btnSignIn = new Button("Sign In");
		btnSignIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSignIn.setForeground(new Color(244, 180, 26));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnSignIn.setForeground(Color.WHITE);
			}
		});
		btnSignIn.setName("btn_SignIn");
		btnSignIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSignIn.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnSignIn.setForeground(Color.WHITE);
		btnSignIn.setBackground(new Color(20, 61, 89));
		// btnNewButton.setBorder(BorderFactory.createEmptyBorder());
		btnSignIn.setBounds(101, 300, 123, 40);
		panelLogin.add(btnSignIn);

		Button btnRegister = new Button("Register");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRegister.setForeground(new Color(244, 180, 26));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnRegister.setForeground(Color.WHITE);
			}
		});
		btnRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegister.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnRegister.setForeground(new Color(255, 255, 255));
		btnRegister.setBackground(new Color(20, 61, 89));
		btnRegister.setBounds(268, 300, 123, 40);
		panelLogin.add(btnRegister);

		JLabel lblForgotPass = new JLabel("Forgot Password?");
		lblForgotPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblForgotPass.setForeground(new Color(244, 180, 26));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblForgotPass.setForeground(Color.WHITE);
			}
		});
		lblForgotPass.setBorder(null);
		lblForgotPass.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblForgotPass.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblForgotPass.setForeground(Color.WHITE);
		lblForgotPass.setBounds(179, 390, 135, 26);
		panelLogin.add(lblForgotPass);

		JLabel lblUsername = new JLabel("");
		lblUsername.setBounds(65, 144, 30, 30);
		panelLogin.add(lblUsername);
		ImageIcon iconUser = new ImageIcon("C:\\Users\\ricog\\git\\MY_EMS_JAVA\\MY_EMS\\icons\\account.png");
		lblUsername.setIcon(scaleIcon(lblUsername, iconUser));

		JLabel lblPassword = new JLabel("");
		lblPassword.setBounds(65, 224, 30, 30);
		panelLogin.add(lblPassword);
		ImageIcon iconPassword = new ImageIcon("C:\\Users\\ricog\\git\\MY_EMS_JAVA\\MY_EMS\\icons\\lock.png");
		lblPassword.setIcon(scaleIcon(lblPassword, iconPassword));

		JLabel lblExit = new JLabel("");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setBorder(new LineBorder(Color.WHITE, 1, true));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblExit.setBorder(null);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		lblExit.setBounds(394, 23, 30, 26);
		panelLogin.add(lblExit);
		ImageIcon iconExit = new ImageIcon("C:\\Users\\ricog\\git\\MY_EMS_JAVA\\MY_EMS\\icons\\exit.png");
		lblExit.setIcon(scaleIcon(lblExit, iconExit));

	}

	// Allows icons to fit into label sizes
	private ImageIcon scaleIcon(JLabel label, ImageIcon icon) {

		Image img = icon.getImage();
		Image imgScaled = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon iconScaled = new ImageIcon(imgScaled);
		return iconScaled;
	}
}
