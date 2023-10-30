package HW5.Model;

public class StudentModel extends User {
    String studentId;

    public StudentModel(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public StudentModel(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                '}';
    }

    public void getInfoStudent(String name, String group, int age, String studentId) {
        System.out.println("Student:" + name + group + age + studentId);
    }

}
