import java.util.ArrayList;

public class Ark {
  // ArrayList<Animal> stores = new ArrayList<Animal>();
  static ArrayList<ITransportable> stores = new ArrayList<ITransportable>();

  public static void main(String[] args) {

    Mamifero perro = new Mamifero("Tom", 2, "Perro", "Macho");
    Mamifero gato = new Mamifero("Michi", 4, "Gato", "Macho");
    Reptil cocodrilo = new Reptil("Pepe", 10, "Cocodrilo", "Macho");
    Insectos escarabajo = new Insectos("Mordo", 5, "Escarabajo", "Hembra");

    
    perro.getVolume(90, 70, 33);
    perro.getWeight(35);
    gato.getVolume(50, 20, 20);
    gato.getWeight(8);
    cocodrilo.getVolume(150, 80, 40);
    cocodrilo.getWeight(60);

    Ark.store(perro);
    Ark.store(gato);
    Ark.store(cocodrilo);
    escarabajo.fly();

  }
  static void store(ITransportable t) {
    Ark.stores.add(t);
    
    Animal.id++;
    for (int i = 0; i < stores.size(); i++) {
      //Ark.stores.get(i).seeAnimals();
      Ark.stores.get(i).eat();
      
    }
    System.out.println("Hay " + Animal.getId() + " animales en el arca");
  }

}
