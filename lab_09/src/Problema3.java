import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class Problema3 extends JFrame implements ItemListener, ActionListener {
    JTextField quiz;
    JCheckBox r1, r2, r3, r4;
    ButtonGroup group;
    JButton button;

    ItemListener il;
    public Problema3(String fis) {
        super("Problema 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        quiz = new JTextField(150);
        quiz.setEditable(false);

        r1 = new JCheckBox();
        r2 = new JCheckBox();
        r3 = new JCheckBox();
        r4 = new JCheckBox();
        JPanel rb=new JPanel();
        rb.setLayout(new GridLayout(4,1));
        rb.add(r1);
        rb.add(r2);
        rb.add(r3);
        rb.add(r4);

        button = new JButton("Raspunde");
        button.setEnabled(false);
        button.addActionListener(this);

        add(quiz, BorderLayout.NORTH);
        add(rb, BorderLayout.CENTER);
        add(button,BorderLayout.SOUTH);

        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);
        r4.addItemListener(this);

        pack();
        setVisible(true);
        try {
            RandomAccessFile br = new RandomAccessFile(fis,"r");
            quiz.setText(br.readLine());
            r1.setText(br.readLine());
            r2.setText(br.readLine());
            r3.setText(br.readLine());
            r4.setText(br.readLine());

        } catch (IOException ex) {
            System.err.println("Exceptie");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        r1.setForeground(Color.black);
        r2.setForeground(Color.black);
        r3.setForeground(Color.black);
        r4.setForeground(Color.black);
        if(e.getSource() instanceof JCheckBox) {
            button.setEnabled(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton) {
            if(r1.isSelected()) {
                r1.setForeground(Color.green);
            }
            if(r2.isSelected()) {
                r2.setForeground(Color.red);
            }
            if(r3.isSelected()) {
                r3.setForeground(Color.green);
            }
            if(r4.isSelected()) {
                r4.setForeground(Color.red);
            }
            button.setEnabled(false);
        }
    }

    public static void main(String args[]) {
        Problema3 pb2 = new Problema3("intrebare.txt");

    }



}