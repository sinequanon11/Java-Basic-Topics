package OOPEncapsulation.OzgurHoca;

public class Main {
    public static void main(String[] args) {

    Course english = new Course("English",70);
    School school = new School("ODTU");
    school.addCourse(english);

    Course german=new Course("German");
    german.setMinScore(56);
    german.getName();




}
}
