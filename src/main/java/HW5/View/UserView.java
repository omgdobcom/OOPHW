package HW5.View;

import HW5.Controller.UserController;
import HW5.Model.StudentModel;
import HW5.Model.TeacherModel;

import java.util.List;

public class UserView {
    UserController controllerUser = new UserController();

    public UserView() {
        this.controllerUser = controllerUser;
    }

    public void saveGroup(TeacherModel teacherId, List<StudentModel> studentId, String name){
        controllerUser.createSG(teacherId,studentId,name);
    }

    public void getGroup(String name){
        System.out.println(controllerUser.getByName(name));
    }
}
