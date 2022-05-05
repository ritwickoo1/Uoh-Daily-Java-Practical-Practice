
package labprogram;

import java.util.ArrayList;


class Course {
    private ArrayList<Student> roster;

    public Course() {
        roster = new ArrayList<Student>();
    }
    
    public int courseSize(){
        return roster.size();
    }
    public void addStudent(Student s){
        roster.add(s);
    }
}
