import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class Java_Gui_Login {
    public static void main(String[] args) {
       
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel userlabel = new JLabel("Username");
        userlabel.setBounds(10, 20, 80, 25);
        panel.add(userlabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordlabel = new JLabel("Password");
        passwordlabel.setBounds(10, 50, 80, 25);
        panel.add(passwordlabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        
        JButton button = new JButton("Log In");
        button.setBounds(10, 80, 80, 25);
        panel.add(button);


        frame.setVisible(true);
    }
}