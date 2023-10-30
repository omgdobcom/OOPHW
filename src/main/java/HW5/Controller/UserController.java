package HW5.Controller;

import HW5.Model.StudentModel;
import HW5.Model.StudyGroup;
import HW5.Model.TeacherModel;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<StudyGroup> studyGroup;

    public UserController() {
        this.studyGroup = new ArrayList<>();
    }

    public void createSG(TeacherModel teacherId, List<StudentModel> studentId, String name) {
        studyGroup.add(new StudyGroup(teacherId, studentId, name));
        System.out.println("group has been added in controller");
    }

    public StudyGroup getByName(String name) {
        for (int i = 0; i < studyGroup.size(); i++) {
            if (studyGroup.get(i).getName().equals(name)) {
                System.out.println("group was found");
                return studyGroup.get(i);
            }
        }
        System.out.println("no group found!");
        return null;
    }

    public List<StudyGroup> getGroup() {
        return studyGroup;
    }

    public void setGroup(List<StudyGroup> studyGroup) {
        this.studyGroup = studyGroup;
    }

    @Override
    public String toString() {
        return "UserController{" +
                "group=" + studyGroup +
                '}';
    }
}
