import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<User> v = new Vector<>();
        User user = new User();
        User user1 = new User(1, "dfghjk", "sdfghj", "sdfghjkl", "dfghjkl");
        Student st = new Student(1.67, new String[]{"oop", "calc", "django"});
        Student st2 = new Student(4.00, new String[]{"ml", "crypto", "diffur"});
        Staff staff = new Staff(20000.5, new String[]{"kitchen", "library", "moika"});
        
        v.add(user); 
        v.add(user1); 
        v.add(st); 
        v.add(st2); 
        v.add(staff);

        for (User u : v) {
            if (u instanceof Student) {
                ((Student) u).getData();
            } else if (u instanceof Staff) {
                ((Staff) u).getData();
            } else {
                u.Data();
            }
        }
    }
}
