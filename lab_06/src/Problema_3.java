import java.util.Collections;
import java.util.Random;
import java.util.Vector;

interface Persoana extends Comparable {
    public double calculMedieGenerala();
    public String getNume();
    public void setNume(String nume);
    public void addMedie(double medie);
}

class Student implements Persoana{
    private String nume;
    private Vector<Double> note;

    Student(){
        note = new Vector<Double>();
    }

    public double calculMedieGenerala(){
        double s = 0;
        for(int i = 0; i < note.size(); i++){
            s += note.elementAt(i);
        }
        return s/note.size();
    }

    public String getNume(){
        return nume;
    }

    public void setNume(String nume){
        this.nume = nume;
    }

    public void addMedie(double medie){
        note.add(medie);
    }

    public int compareTo(Object o){
        if(o == null)
            throw new NullPointerException();
        if(!(o instanceof Student))
            throw new ClassCastException("Nu se poate compara!");
        Student s = (Student) o;
        if(nume.equals(s.nume)){
            double medie1 = this.calculMedieGenerala();
            double medie2 = s.calculMedieGenerala();
            if(medie1 < medie2)
                return 1;
            if(medie1 == medie2)
                return 0;
            return -1;
        }
        return nume.compareTo(s.nume);
    }

    public String toString(){
        String s = "";
        s += nume + " " + this.calculMedieGenerala();
        return s;
    }
}

public class Problema_3 {
    public static void main(String[] args){
        Vector<Student> vs = new Vector<Student>();
        for(int i = 0; i < 10; i++){
            Student st = new Student();
            st.setNume("Marian"+i);
            Random rd = new Random();
            for(int j = 0; j < 5; j++){
                st.addMedie(rd.nextDouble(10));
            }
            vs.add(st);
        }

        Student st = new Student();
        st.setNume("Marian9");
        Random rd = new Random();
        for(int j = 0; j < 5; j++){
            st.addMedie(rd.nextDouble(10));
        }
        vs.add(st);
        Collections.sort(vs);
        System.out.println(vs);
    }
}
