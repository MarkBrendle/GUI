import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class JFrames {
    public static void main(String[] args) {
        JFrame a = new JFrame("Major Project");
        JPanel b = new JPanel();
        b.setLayout(null);
        JButton c = new JButton( "Hello");
        c.setBounds(200, 50, 100, 30);
        JLabel f = new JLabel("hello");
        JButton h = new JButton("End");
        h.setBounds(0,0,80,20);
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent d){
                JLabel g = new JLabel();
                g.setBounds(0, 0, 100,50);
                b.add(g);
                for (int i = 10; i >= 1; i--){
                    g.setText("hello");
                }
            }
        });
        h.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent i){
                System.exit(0);
            }
        });


        a.add(b);
        b.add(c);
        a.setSize(500, 500);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.add(f);
        b.add(h);
    }

}
