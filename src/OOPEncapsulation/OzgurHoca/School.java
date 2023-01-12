package OOPEncapsulation.OzgurHoca;

import java.util.ArrayList;

public class School {

     String name;
     ArrayList<Course> courses = new ArrayList<>();

    public School(String name) {this.name = name;}

    public void addCourse (Course course){
        this.courses.add(course);
    }



}
