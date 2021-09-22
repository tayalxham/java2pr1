import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*; 
import javax.awt.*;
import java.applet.*;

    public class Java_Gui_Applet extends JApplet{
    
        public static void main(String[] args) {
       
            JPanel panel = new JPanel();
            JFrame frame = new JFrame();
            frame.setSize(350,250);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);
    
            panel.setLayout(null);
    
            JLabel FNamelabel = new JLabel("First Name");
            FNamelabel.setBounds(10, 20, 80, 25);
            panel.add(FNamelabel);
    
            JTextField FNameText = new JTextField(20);
            FNameText.setBounds(100, 20, 165, 25);
            panel.add(FNameText);
    
            JLabel LNamelabel = new JLabel("Last Name");
            LNamelabel.setBounds(10, 50, 80, 25);
            panel.add(LNamelabel);
    
            JTextField LNameText = new JTextField(20);
            LNameText.setBounds(100, 50, 165, 25);
            panel.add(LNameText);
    
            JLabel Emaillabel = new JLabel("E-Mail");
            Emaillabel.setBounds(10, 80, 80, 25);
            panel.add(Emaillabel);
    
            JTextField EmailText = new JTextField(20);
            EmailText.setBounds(100, 80, 165, 25);
            panel.add(EmailText);
    
            JLabel Phonelabel = new JLabel("Cell Number");
            Phonelabel.setBounds(10, 110, 80, 25);
            panel.add(Phonelabel);
    
            JTextField PhoneText = new JTextField(20);
            PhoneText.setBounds(100, 110, 165, 25);
            panel.add(PhoneText);
    
            JButton button = new JButton("Submit");
            button.setBounds(10, 140, 80, 25);
            panel.add(button);
    
    
            frame.setVisible(true);
    
        }

    }



    
