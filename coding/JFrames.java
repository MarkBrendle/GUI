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
        JButton c = new JButton( "Continue");
        c.setBounds(200, 50, 100, 30);
        JLabel f = new JLabel("hello");
        JButton h = new JButton("End");
        h.setBounds(0,0,80,20);
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent d){
                JLabel g = new JLabel();
                g.setBounds(230, 200, 100,50);
                b.add(g);
                c.setBounds(600, 600, 10,10);
                JLabel j = new JLabel("please select a password");
                b.add(j);
                j.setBounds(175, 150, 300, 50);
                JButton k = new JButton("12345");
                k.setBounds(100, 200, 100, 20);
                b.add(k);
                JButton l = new JButton("54321");
                l.setBounds(300, 200, 100, 20);
                b.add(l);
                JButton m = new JButton("passord");
                m.setBounds(100, 300, 100, 20);
                b.add(m);
                JButton n = new JButton("Password");
                n.setBounds(300, 300, 100,20);
                b.add(n);
                k.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent o) {
                        System.exit(0);
                    }
                });
                l.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent p) {
                        System.exit(0);
                    }
                });
                m.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent q) {
                        k.setBounds(600,600,10,10);
                        l.setBounds(600,600,10,10);
                        m.setBounds(600,600,10,10);
                        n.setBounds(600,600,10,10);
                        j.setBounds(600,600,10,10);
                        JButton t = new JButton("back");
                        b.add(t);
                        t.setBounds(200, 50, 100,20);
                        t.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent u) {
                                a.dispose();
                                main(null);
                            }
                        });
                    }
                });
                n.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent r) {
                        System.exit(0);
                    }
                });
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
