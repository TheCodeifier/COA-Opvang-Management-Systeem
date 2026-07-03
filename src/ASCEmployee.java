public class ASCEmployee extends Employee {

    private String function;
    private ASC asc;

    public ASCEmployee(int id, String name, String function, ASC asc) {
        super(id, name);
        this.function = function;
        this.asc = asc;
    }
}