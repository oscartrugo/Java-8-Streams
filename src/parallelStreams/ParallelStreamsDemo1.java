package parallelStreams;

import java.util.Arrays;
import java.util.List;

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

}

public class ParallelStreamsDemo1 {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("David", 82),
                new Student("Bob", 90),
                new Student("Joh", 65),
                new Student("Canedy", 55),
                new Student("Eric", 85),
                new Student("Smith", 88),
                new Student("Scott", 50)
        );

        // using stream() - sequential
//        studentList.stream()
//                .filter(student -> student.getScore() > 80)
//                .limit(3)
//                .forEach(s ->
//                    System.out.println(s.getName() + " " + s.getScore())
//                );

        // using parallelStream()
        studentList.parallelStream()
                .filter(student -> student.getScore() > 80)
                .limit(3)
                .forEach(s ->
                        System.out.println(s.getName() + " " + s.getScore())
                );

        // convert stream() --Z parallelStream()
        studentList.stream()
                .parallel()
                .filter(student -> student.getScore() > 80)
                .limit(3)
                .forEach(s ->
                    System.out.println(s.getName() + " " + s.getScore())
                );
    }
}
