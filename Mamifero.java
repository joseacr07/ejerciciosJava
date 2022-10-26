public class Mamifero extends Animal implements ITransportable {

    public Mamifero(String name, int age, String raze, String type) {
        super(name, age, raze, type);
    }

    @Override
    public void showInfo() {
    }

    @Override
    public void move() {
        this.walk();
    }

    @Override
    public void stop() {
    }

    @Override
    public void eat() {
        System.out.println(getName() + " está comiendo. Noé le da carne y agua. Las reservas de carne son "
                + Food.meat-- + " y de agua " + Food.water--);
    }

  /*   @Override
    public void seeAnimals() {
        for (int i = 0; i < Ark.stores.size(); i++) {
            System.out.println(((Animal) Ark.stores.get(i)).getName() + " ha ingresado al Arca en la posición "
                    + Animal.id);
        }
    }*/
    @Override
    public void getVolume(double largo, double ancho, double alto) {
        System.out.println(getName() + " ocupa un espacio de " + ((largo * ancho * alto) / 1000000)
                + " metros cuadrados dentro del arca.");

    }
    @Override
    public double getWeight(double kg) {
        System.out.println(getName() + " es un " + getRaze() + " que pesa " + kg + " kilos.");
        return (kg);
    }
}
