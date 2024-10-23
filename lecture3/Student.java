package lecture3;

public class Student {
    private String name; 
    private String surname;
    private double gpa;
    private int id;

    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "Beknur", "Ermek", 4.00),
            new Student(2, "Sanzhar", "Baibol", 3.67),
            new Student(3, "Jainar", "Aibol", 3.33),
            new Student(4, "Fermin", "Lopez", 3.00),
            new Student(5, "Lamine", "Yamal", 2.67)
        };

        Student top = new Student().topStudent(students);
        if (top != null) {
            System.out.println("Top student is:");
            top.getStudentData();
        }
    }
    Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    Student() {
    }

    public void getStudentData() {
        System.out.println(id + " " + name + " " + surname + " " + gpa);
    }

    public double topStudent(Student[] students) {
        

        Student topStudent = students[0];

        for (int i = 1; i < students.length; i++) {
            if (topStudent.gpa < students[i].gpa) {
                topStudent = students[i];
            }
        }

        return topStudent.gpa;
    }
}
