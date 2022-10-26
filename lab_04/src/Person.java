import java.util.Vector;

public class Person {
    private String name;
    private String address;

    Person(){
        this("Marcel", "boschetele nr 2");
    }

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String toString(){
        return name + " " + address;
    }
}

class Student extends Person{
    Vector courses, grades;
    Student(){
        super();
        courses = new Vector();
        grades = new Vector();
    }
    Student(String name, String address){
        super(name, address);
        courses = new Vector();
        grades = new Vector();
    }

    public void addCourseGrade(String course, int grade){
        courses.add(course);
        grades.add(grade);
    }

    public void printGrades(){
        String ans = "";
        for(int i = 0; i < grades.size(); i++){
            ans += grades.elementAt(i);
            ans += " ";
        }
        System.out.println(ans);
    }

    public double getAverageGrade(){
        double ans = 0;
        for(int i = 0; i < grades.size(); i++)
            ans += (double)grades.elementAt(i);
        return ans / grades.size();
    }
}

class Teacher extends Person{
    Vector courses;
    Teacher(){
        super();
        courses = new Vector();
    }
    Teacher(String name, String address){
        super(name, address);
        courses = new Vector();
    }
    public boolean addCourse(String course){
        if(courses.contains(course))
            return false;
        courses.addElement(course);
        return true;
    }
    public boolean removeCourse(String course){
        return courses.removeElement(course);
    }
}

class Test4 {
    public static void main(String args[]) {
        Person student, teacher, person;
        student = new Student("Popescu Ion", "Bucuresti");
        teacher = new Teacher("Ionescu Gigel", "Bucuresti");
        person = new Person("Maria", "Iasi");
        assert (person.getName().equals("Maria")) : "Metoda getName din clasa Person nu este implementata corect";
        assert (((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).addCourse("Algoritmica")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).addCourse("Matematica")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (!((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).removeCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (!((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        ((Student) student).addCourseGrade("Programare", 10);
        ((Student) student).addCourseGrade("Algoritmica", 9);
        ((Student) student).addCourseGrade("Matematica", 8);
        assert (Math.abs(((Student) student).getAverageGrade() - 9.00) <= 0.001) : "Metoda getAverageGrade din clasa " +
                "Student nu a fost implementat corect";
        ((Student) student).printGrades();
        //Ce metoda toString se va apela? Din ce clasa?
        System.out.println(student);
        System.out.println(person);
        System.out.println("Felicitari! Problema a fost rezolvata corect!");
    }
}