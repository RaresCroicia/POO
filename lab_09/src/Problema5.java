import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.concurrent.*;

public class Problema5 extends JFrame implements ActionListener {
    private JButton btn;
    private ArrayList<Color> vct;

    public Problema5(String title) {
        super(title);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(500, 500));
        getContentPane().setBackground(Color.gray);
        setLayout(new FlowLayout());

        vct = new ArrayList<>();

        vct.add(Color.RED);
        vct.add(Color.BLUE);
        vct.add(Color.GREEN);

        btn = new JButton("Color change");
        btn.setEnabled(true);
        btn.setMnemonic(KeyEvent.VK_C);
        btn.addActionListener(this);

        add(btn);
        show();
        pack();
    }

    public static void main(String[] args) {
        Problema5 test = new Problema5("Problema 5");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 3);
        int randomNum1 = ThreadLocalRandom.current().nextInt(0, 3);
        btn.setBackground(vct.get(randomNum));
        btn.setForeground(vct.get(randomNum1));
    }
}