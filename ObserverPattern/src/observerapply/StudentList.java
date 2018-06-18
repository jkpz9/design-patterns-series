package observerapply;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> data;
    
    StudentList() { data = new ArrayList<>(); }
    
    public void add(Student s) {
        data.add(s);
    }

    public List<Student> getData() {
        return data;
    }
    
    
}
