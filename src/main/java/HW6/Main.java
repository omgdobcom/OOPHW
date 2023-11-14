package HW6;

public class Main {
    public static void main(String[] args) {
        ClassOfTeachers<Teacher> teachers = new ClassOfTeachers<>("teacherss");
        teachers.add(new ChemistryTeacher("Peter", "Ivanych"));
        teachers.add(new ShopTeacher("Agafiya", "Sergeevna"));

        for (int index = 0; index < teachers.count(); index++) {
            System.out.println(teachers.get(index));
        }
    }
}
