public class Tiger extends Mammals {
    private String zoo;

    public Tiger(String name, String areaLive, int age, String zoo) {
        super(name, areaLive, age);
        this.zoo = zoo;
    }

    public String getInfo() {
        return "Age: " + getAge() +
                "\nName: " + getName() +
                "\nArea live: " + getAreaLive();
    }

    public final String getCommand(String command) {
        return command;
    }

    public int getCommand(int amoutCommand) {

        return amoutCommand;
    }


}



