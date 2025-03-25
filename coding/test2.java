import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class test2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bios");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("hello");
        JButton oc = new JButton("OC ");
        JButton hi = new JButton("Components");
        oc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("OC");
                System.out.println("you can't do that");
                panel.remove(oc);
                panel.remove(hi);
                JButton back = new JButton("Back");
                panel.add(back);
                back.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a) {
                        frame.dispose();
                        main(null);
                    }
                });
            }
        });
        hi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                label.setText("Components");
                System.out.println("hello there");
                panel.remove(oc);
                panel.remove(hi);
                JButton back = new JButton("Back");
                panel.add(back);
                back.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a) {
                        frame.dispose();
                        main(null);
                    }
                });
            }
        });

        frame.add(panel);
        panel.add(label);
        panel.add(oc);
        panel.add(hi);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
