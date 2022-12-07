import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Problema4 extends JFrame implements ChangeListener {
    private JSlider R;
    private JSlider G;
    private JSlider B;
    private JTextField txt;

    public Problema4(String title) {
        super(title);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(500, 500));
        getContentPane().setBackground(Color.gray);
        setLayout(new FlowLayout());

        R = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        G = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        B = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);

        R.addChangeListener(this);
        G.addChangeListener(this);
        B.addChangeListener(this);

        add(R);
        add(G);
        add(B);

        txt = new JTextField("Tester");
        txt.setEnabled(false);
        add(txt);

        show();
        pack();
    }

    public static void main(String[] args) {
        Problema4 test = new Problema4("Problema 5");
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        String color = Integer.toHexString(R.getValue()).toString() + Integer.toHexString(G.getValue()).toString() + Integer.toHexString(B.getValue()).toString();
        //txt.setText(Integer.toHexString(R.getValue()).toString() + Integer.toHexString(G.getValue()).toString() + Integer.toHexString(B.getValue()).toString());
        txt.setBackground(new Color(R.getValue(), G.getValue(), B.getValue()));
        txt.setForeground(new Color(R.getValue(), G.getValue(), B.getValue()));
    }
}