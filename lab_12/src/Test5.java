import java.util.ArrayList;
import java.util.List;

interface Visitor {
    void visit (Director f);
    void visit (Fisier f);
}
class Ls implements Visitor {
    public void visit (Director f) {
        System.out.println(f.getName());
        for (Repository repo: f.getChildren()) {
            System.out.println("\t" + repo.getName());
            // afisam numele unui repo (fisier / folder)
        }
    }
    public void visit (Fisier f) {
        System.out.println("Not a folder");
                  /* comanda Ls (in acest exemplu) este specifica doar folderelor,
                  in acest caz este evidentiat un dezavantaj al  Visitor-ului,
                  faptul ca noi trebuie sa implementam metode de care nu avem nevoie
                  in acest caz - se incalca Interface Segregation Principle  */
    }
}
class Cat implements Visitor {
    public void visit (Director f) {
        System.out.println("Not a file");
    }
    public void visit (Fisier f) {
        // citire fisier, folosind numele fisierului
    }
}
abstract class Repository {
    private String name;
    // numele unui fisier sau folder (de fapt, calea acestuia)
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public abstract void accept (Visitor f);
}
class Fisier extends Repository {
    public void accept (Visitor f) {
        f.visit(this);
        // Visitor-ul "viziteaza" fisierul, adica acesta
        //efectueaza o operatie asupra fisierului
    }
}
class Director extends Repository {
    private List<Repository> children = new ArrayList<>();

    public void addChild(Repository rep) {
        children.add(rep);
    }
    public List<Repository> getChildren() {
        return children;
    }
    public void accept (Visitor f) {
        f.visit(this);
    }
}

public class Test5 {
    public static void main(String[] args) {
        Director dir = new Director();
        dir.setName(".");
        Cat cat = new Cat();
        Ls ls = new Ls();
        cat.visit(dir);
        ls.visit(dir);
    }
}
