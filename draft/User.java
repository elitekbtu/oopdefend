public class User{
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname; 
    User(){
        
    }
    User(int id, String login, String password, String name, String surname){
        this.id = id; 
        this.login = login; 
        this.password = password; 
        this.name =name; 
        this.surname = surname;
    }
    public int getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getSurname() {
        return surname;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String Data() {
        return "Name: " + name + " Surname: " + surname + " id: " + id + " login: " + login  + " password: " + password;
    }
}
