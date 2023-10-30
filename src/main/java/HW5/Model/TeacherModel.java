package HW5.Model;

public class TeacherModel extends User {
    String teacherId;

    public TeacherModel(String name, int age, String teacherId) {
        super(name, age);
        this.teacherId = teacherId;
    }

    public TeacherModel(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                '}';
    }
}
