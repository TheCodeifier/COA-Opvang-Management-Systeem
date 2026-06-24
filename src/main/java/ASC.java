public class ASC {
    private int id;
    private String name;
    private String function;

    public ASC(int id, String name, String function) {
        this.id = id;
        this.name = name;
        this.function = function;
    }

    public ASC() {
        // optioneel voor snelle testing in Main
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFunction() {
        return function;
    }
}