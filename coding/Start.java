import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Start {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Start");
        JFrame frame2 = new JFrame("Two");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Bios");
        JButton button = new JButton("Start");
        JButton button2 = new JButton("Exit");
        JPanel panel2 = new JPanel();
        
        JLabel label2 = new JLabel("System");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel2.setLayout(new FlowLayout());
                frame2.dispose();
            }
        });
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        panel.add(label);
        panel.add(button);
        panel.add(button2);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame2.add(panel2);
        frame2.setSize(500, 500);
        frame.setVisible(true);
    }

}
