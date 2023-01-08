package cie_1_lab_cycle_practice_programs;

class Teacher {
    private int Teacher_ID;
    private String Teacher_Name;
    private String T_Specialization;
    private String T_CollegeName;
    private String T_Experience;
    private String T_Course;

    Teacher(int Teacher_ID, String Teacher_Name, String T_Specialization, String T_CollegeName, String T_Experience,
            String T_Course) {
        this.Teacher_ID = Teacher_ID;
        this.Teacher_Name = Teacher_Name;
        this.T_Specialization = T_Specialization;
        this.T_CollegeName = T_CollegeName;
        this.T_Experience = T_Experience;
        this.T_Course = T_Course;
    }

    public int getTeacher_ID() {
        return Teacher_ID;
    }

    public String getTeacher_Name() {
        return Teacher_Name;
    }

    public String getT_Specialization() {
        return T_Specialization;
    }

    public String getT_CollegeName() {
        return T_CollegeName;
    }

    public String getT_Experience() {
        return T_Experience;
    }

    public String getT_Course() {
        return T_Course;
    }
}

public class _8b_teacher {
    public static void main(String[] args) {
        Teacher tr = new Teacher(100, "Andrew Ng", "AI", "Stanford University", "20 years", "Deep Learning");

        System.out.println("Instructor Details:-");
        System.out.println("ID: " + tr.getTeacher_ID());
        System.out.println("Name: " + tr.getTeacher_Name());
        System.out.println("Specialization: " + tr.getT_Specialization());
        System.out.println("College: " + tr.getT_CollegeName());
        System.out.println("Experience: " + tr.getT_Experience());
        System.out.println("Course: " + tr.getT_Course());
    }
}
