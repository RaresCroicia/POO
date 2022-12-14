import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.*;
class Book {
    private String name;
    private String author;
    private String iconName;

    public Book(String name, String author, String iconName) {
        this.name = name;
        this.author = author;
        this.iconName = iconName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
    public String toString()
    {
        return iconName + name + author;
    }
}

// Problema 1
//class AppJList extends JFrame {
//    public AppJList() {
//        super("Aplicatie JList");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Vector<Book> books = new Vector<Book>();
//        books.add(new Book("Programarea C ", "Autor 1", "icon1"));
//        books.add(new Book("Programarea Java ", "Autor 2", "icon2"));
//        books.add(new Book("Programarea Kotlin ", "Autor 3", "icon3"));
//
//        JScrollPane scrollPane = new JScrollPane();
//        JList<Book> list = new JList<>(books);
//        scrollPane.setViewportView(list);
//        list.setLayoutOrientation(JList.VERTICAL);
//        add(scrollPane);
//        setVisible(true);
//        pack();
//
//    }
//}

class AppJList extends JFrame implements ListSelectionListener, ActionListener {
    JList<Book> list;
    JTextField author, title;
    JButton button;
    DefaultListModel<Book> books;

    public AppJList() {
        super("Aplicatie JList");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        books = new DefaultListModel<Book>();
        books.addElement(new Book("Programarea C ", "Autor 1", "cpp"));
        books.addElement(new Book("Programarea Java ", "Autor 2", "java"));
        books.addElement(new Book("Programarea IOS ", "Autor 3", "ios"));

        JScrollPane scrollPane = new JScrollPane();
        list = new JList<Book>(books);
        scrollPane.setViewportView(list);
        list.setLayoutOrientation(JList.VERTICAL);
        list.addListSelectionListener(this);

        JPanel p1 = new JPanel(new BorderLayout());
        JPanel p2 = new JPanel(new BorderLayout());
        JPanel p3 = new JPanel(new BorderLayout());
        JLabel label1 = new JLabel("Autor");
        JLabel label2 = new JLabel("Titlu");

        p2.add(label1, BorderLayout.PAGE_START);
        p2.add(label2, BorderLayout.PAGE_END);


        author = new JTextField();
        author.setColumns(50);
        title = new JTextField();
        title.setColumns(50);
        p3.add(author, BorderLayout.PAGE_START);
        p3.add(title, BorderLayout.PAGE_END);

        p1.add(p2, BorderLayout.LINE_START);
        p1.add(p3, BorderLayout.LINE_END);
        add(scrollPane);
        add(p1);

        button = new JButton("Remove");
        button.setEnabled(false);
        button.addActionListener(this);

        add(button);

        setVisible(true);
        pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int index = list.getSelectedIndex();
        button.setEnabled(false);
        books.remove(index);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if(list.isSelectionEmpty()){
            author.setText("");
            title.setText("");
            button.setEnabled(false);
            return;
        }
        Book book = list.getSelectedValue();
        author.setText(book.getAuthor());
        title.setText(book.getName());
        button.setEnabled(true);
    }
}

public class App1 {
    public static void main(String[] args){
        AppJList app1 = new AppJList();
    }
}
