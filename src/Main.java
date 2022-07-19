public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Animal");
        Zoo zoo1 = new Zoo("Bobik");


        Cat objectA = new Cat("Marsic","Bishkek",4, "Animal", Color.BLACK );

        Tiger objectB = new Tiger("Rozi", "Berlin", 7, "Bobik");
        Tiger objectC = new Tiger("Stew", "Berlin", 3, "Bobik");

        System.out.println(objectA.getInfo() + "\n"  + objectA.getCommand(1) + "\n---------------------");

        System.out.println(objectB.getInfo() + "\n" + objectB.getCommand("Rrrrrrrrrrrrrrrr") + "\n---------------------");

        System.out.println(objectC.getInfo() + "\n" + objectC.getCommand("ARrrrrrrrrrrrrrrrrrrr")+
               " \n_____________________");
    }


}