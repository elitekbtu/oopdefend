public class Student extends User {
    public double gpa; 
    public String[] courses; 
    Student(double gpa, String[] courses){
        super();
        this.courses = courses; 
        this.gpa = gpa;
    }
    public String[] getCourses() {
        return courses;
    }
    public double getGpa() {
        return gpa;
    }
    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void getData(){
        System.out.println("Gpa: " + gpa+ '\n');
        for(String x:courses){
            System.out.println(x);
        }
    }
}
