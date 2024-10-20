package streams.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class flatMapDemoThree {
    public static void main(String args[]){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("sarvajith" , 'A' ,24 ));
        studentList.add(new Student("sarvajith1" , 'B' ,25 ));
        studentList.add(new Student("sarvajith2" , 'B' ,23 ));

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student("scott" , 'A' ,20 ));
        studentList2.add(new Student("tom" , 'B' ,22 ));
        studentList2.add(new Student("asif" , 'B' ,21 ));

        List<List<Student>> studentFinalList = Arrays.asList(studentList2,studentList);

        List<String> studentListFinal = studentFinalList.stream()
                .flatMap(e->e.stream())
                .map(s->s.sname)
                .toList();
        System.out.println(studentListFinal);






    }

}
class Student{
    String sname;
    int sid;
    char grade;

    public Student(String sname, char grade, int sid) {
        this.sname = sname;
        this.grade = grade;
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", sid=" + sid +
                ", grade=" + grade +
                '}';
    }
}
