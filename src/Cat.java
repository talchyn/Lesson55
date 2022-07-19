public final class Cat extends Tiger {
    private Color anColor;


    public Cat(String name, String areaLive, int age, String zoo, Color anColor) {
        super(name, areaLive, age, zoo);
        this.anColor = anColor;

    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nanColor:" + anColor;
    }
}






