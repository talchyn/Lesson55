public abstract class Mammals {
    private String name;
    private String areaLive;
    private int age;


    public Mammals(String name, String areaLive, int age) {
        this.name = name;
        this.areaLive = areaLive;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getAreaLive() {
        return areaLive;
    }

    public int getAge() {
        return age;
    }


}
