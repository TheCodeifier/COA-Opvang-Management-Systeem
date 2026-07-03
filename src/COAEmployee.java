public class COAEmployee extends Employee {

    private String role;

    public COAEmployee(int id, String name, String role) {
        super(id, name);
        this.role = role;
    }
}