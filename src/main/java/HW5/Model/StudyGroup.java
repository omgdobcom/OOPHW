package HW5.Model;

import java.util.List;

public class StudyGroup {
    private TeacherModel teacher;
    private List<StudentModel> student;
    private String name;

    public StudyGroup(TeacherModel teacher, List<StudentModel> student, String name) {
        this.teacher = teacher;
        this.student = student;
        this.name = name;
    }

    public TeacherModel getTeacher() {
        return teacher;}

    public void setTeacher(TeacherModel teacher) {
        this.teacher = teacher;}

    public List<StudentModel> getStudent() {
        return student;
    }

    public void setStudent(List<StudentModel> student) {
        this.student = student;
    }

    public StudyGroup createStudyGroup(TeacherModel teacher, List<StudentModel> student, int number) {
        return new StudyGroup(teacher, student, name);
    }

    public String getName() {
        return name;}

    public void setNumber(String name) {
        this.name = name;}

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher= " + teacher +
                ", student= " + student +
                ", name= " + name +
                '}';
    }
}
