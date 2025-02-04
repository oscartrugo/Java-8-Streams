package flatmapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String sname;
    int sid;
    char grade;

    public Student(String sname, int sid, char grade) {
        this.sname = sname;
        this.sid = sid;
        this.grade = grade;
    }
}

public class FlatmapDemo3 {
    public static void main(String[] args) {

        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Smith", 101, 'A'));
        students1.add(new Student("John", 102, 'B'));
        students1.add(new Student("Kenedy", 103, 'C'));

        List<Student> students2= new ArrayList<>();
        students2.add(new Student("Scott", 104, 'A'));
        students2.add(new Student("Mary", 105, 'B'));
        students2.add(new Student("Kitty", 106, 'C'));

        List<List<Student>> students = Arrays.asList(students1, students2);

        List<String> studentsNames = students.stream()
                .flatMap(s -> s.stream().map(student -> student.sname))
                .collect(Collectors.toList());

        System.out.println(studentsNames);
    }
}
