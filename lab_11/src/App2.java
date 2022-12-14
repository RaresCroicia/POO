import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;

public class App2 extends JFrame {
    JTree tree;
    JTable table;

    public App2() {
        super("File Browser");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        table = new JTable();
        File dir = new File(".");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(dir.getPath());
        tree = new JTree(root);
        add(tree, BorderLayout.PAGE_START);
        add(table, BorderLayout.PAGE_END);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        App2 app = new App2();
    }

}
