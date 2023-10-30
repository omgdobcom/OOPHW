package HW5;

import HW5.Model.StudentModel;
import HW5.Model.TeacherModel;
import HW5.View.UserView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherModel teacher = new TeacherModel("Sergey Artimovich", 33, "001");
        StudentModel student1 = new StudentModel("Sergey Lebedev", 8, "S001");
        StudentModel student2 = new StudentModel("Mariya Basova", 35, "M002");
        UserView userView = new UserView();
        userView.saveGroup(new TeacherModel(teacher.getTeacherId()),
                (List.of(new StudentModel(student1.getStudentId()), new StudentModel(student2.getStudentId()))),
                "group1");
        userView.getGroup("group1");
//        userView.getGroup("group2");
    }
}
