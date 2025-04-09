import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bios");
        JPanel panel = new JPanel();
        panel.setLayout(null); // Set layout to null for absolute positioning
        JLabel label = new JLabel("hello");
        label.setBounds(235, 20, 100, 30); // Position and size of the label
        JLabel labela = new JLabel("Enable auto overclock.");
        labela.setBounds(50, 100, 200, 30); // Position and size of the label2
        JButton oc = new JButton("OC ");
        oc.setBounds(200, 50, 100, 30); // Position and size of the OC button
        JButton hi = new JButton("Components");
        hi.setBounds(40, 50, 150, 30); // Position and size of the Components button
        JButton exit = new JButton("Exit");
        exit.setBounds(310, 50, 100, 30); // Position and size of the Exit button

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent b) {
                System.exit(0);
            }
        });

        oc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("OC");
                System.out.println("you can't do that");
                panel.remove(oc);
                panel.remove(hi);
                JButton back = new JButton("Back");
                back.setBounds(50, 50, 100, 30); // Position and size of the Back button
                panel.add(back);
                JButton enable = new JButton("Enable");
                enable.setBounds(200, 100, 100, 30); // Position and size of the Enable button
                panel.add(enable);
                panel.add(labela); // Add the labela to the panel
                panel.revalidate();
                panel.repaint();
                enable.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent d) {
                        System.out.println("Overclock enabled");
                        enable.setText("Disable");
                        enable.removeActionListener(this); // Remove the previous action listener
                        enable.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent d) {
                                System.out.println("Overclock disabled");
                                enable.setText("Enable");
                            } 
                        });
                    }
                });
                back.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a) {
                        System.out.println("please work");
                        frame.dispose();
                        main(null);
                    }
                });
            }
        });

        hi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                label.setText("Components");
                label.setBounds(200, 20, 100, 30);
                System.out.println("hello there");
                panel.remove(oc);
                panel.remove(hi);
                JButton back = new JButton("Back");
                back.setBounds(70, 50, 100, 30); // Position and size of the Back button
                panel.add(back);
                panel.revalidate();
                panel.repaint();
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
        panel.add(exit);
        frame.setSize(500, 500); // Adjusted frame size for better layout
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
