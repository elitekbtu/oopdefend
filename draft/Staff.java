public class Staff extends User {
    public double salary; 
    public String[] subjects; 

    Staff(double salary, String []subjects){
        super(); 
        this.salary = salary;
        this.subjects = subjects;

    }
    public double getSalary() {
        return salary;
    }
    public String[] getSubjects() {
        return subjects;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
    public void getData(){
        System.out.println(salary+'\n'); 
        for(String x:subjects){
            System.out.println(x);
        }
    }
}
