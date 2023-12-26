public class Course {
    String name;
    String code;
    String prefix;
    int note;

    Teacher teacher;

    Course(String name, String code, String prefix, Teacher teacher){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;
    }
}
