import java.util.Comparator;
import java.util.TreeSet;

class Catalog extends TreeSet<Catalog.Student> {

    class Student implements Comparable{
        public String name;
        public double media;
        public int clazz;

        Student(String name, double average, int clazz){
            this.name = name;
            this.media = average;
            this.clazz = clazz;
        }

        @Override
        public int compareTo(Object o) {
            Student so = (Student) o;
            if(media == so.media){
                return name.compareTo(so.name);
            }
            return (int) (media - so.media);
        }

        public String toString(){
            String ans = "";
            ans += name + " are media " + media + "! E la grupa " + clazz;
            return ans;
        }
    }

    Comparator comparator;

    Catalog(Comparator comparator){
        this.comparator = comparator;
    }

    Catalog(){
        comparator = null;
    }

    public void addStudent(String name, double media, int clazz){
        this.add(new Student(name, media, clazz));
    }

    public Student getStudent(String name){
        for(Student student : this){
            if(student.name.equals(name))
                return student;
        }
        return null;
    }

    public void removeStudent(String name){
        Student toRemove;
        for(Student student : this){
            if(student.name.equals(name)) {
                toRemove = student;
                break;
            }
        }
    }

    @Override
    public int size() {
        return super.size();
    }

    public Catalog byClass(int clazz){
        Catalog catalog = new Catalog(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Student so1 = (Student)o1;
                Student so2 = (Student)o2;
                return so1.compareTo(so2);
            }
        });
        for(Student student : this){
            if(student.clazz == clazz)
                catalog.addStudent(student.name, student.media, student.clazz);
        }
        return catalog;
    }

}

public class Problema_02 {
    public static void main(String[] args){
        Catalog catalog = new Catalog();
        catalog.addStudent("Alexandru", 7, 324);
        catalog.addStudent("Ioana", 5, 321);
        catalog.addStudent("Maria", 10, 322);
        catalog.addStudent("Ionut", 6.2, 323);
        catalog.addStudent("Diana", 7, 322);

        Catalog catalog2 = new Catalog(new Comparator<Catalog.Student>() {
            @Override
            public int compare(Catalog.Student o1, Catalog.Student o2) {
                return o1.compareTo(o2);
            }
        });
        catalog2.addAll(catalog);

        System.out.println("Verificam...");
        System.out.println("Continutul colectiei: " + catalog);
        System.out.println("Continutul colectiei: " + catalog2);

        Catalog.Student last = null;
        for (Catalog.Student o : catalog) {
            if (last == null) {
                last = o;
                continue;
            }
            int r = last.media != o.media ? new Double(last.media).compareTo(o.media) : last.name.compareTo(o.name);
            if (r != last.compareTo(o)) {
                System.err.println("Catalog.Student.compareTo a fost implementata gresit.");
            }
        }

        if (catalog.size() != 5) {
            System.err.println("Catalog.size() a fost implementata gresit.");
        }

        catalog.removeStudent("Ionut");
        if (catalog.size() != 4) {
            System.err.println("Catalog.remove() a fost implementata gresit.");
        }
        catalog.removeStudent("");
        if (catalog.size() != 4) {
            System.err.println("Catalog.remove() a fost implementata gresit.");
        }

        if (catalog.byClass(322).size() != 2) {
            System.err.println("Catalog.byClass() a fost implementata gresit.");
        }

        catalog.removeStudent("Maria");
        if (catalog.byClass(322).size() != 1) {
            System.err.println("Catalog.remove() a fost implementata gresit.");
        }

        if (catalog.getStudent("Maria") != null) {
            System.err.println("Catalog.getStudent() a fost implementata gresit.");
        }

        if ((catalog.getStudent("Alexandru") == null) || (catalog.getStudent("Alexandru").media != 7)) {
            System.err.println("Catalog.getStudent() a fost implementata gresit.");
        }
    }
}
