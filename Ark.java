import java.util.ArrayList;

public class Ark {
     static ArrayList<Animal> group = new ArrayList<Animal>();
    public static void main(String[] args) {

        Ark ark = new Ark();
        Mamifero vaca = new Mamifero("fliyin", "magic");
        Mitological gargoyle = new Mitological("Hybrid", "bruiser");
        Reptil superAnaconda = new Reptil("Poisonous", "swamp");
        ark.store(vaca , superAnaconda , gargoyle);
        
        System.out.println(ark.group.size());  

        
    }
    public void store(Mamifero vaca, Reptil superAnaconda, Mitological gargoyle){
       group.add(superAnaconda);
       group.add(vaca);
       group.add(gargoyle);
       for (Animal animal : group) {
        animal.walk();
        animal.seat();
       System.out.println(" se ha guardado un/una" + vaca.getType()); 
       System.out.println(" se ha guardado un/una" + gargoyle.getType());
       System.out.println("Se ha guardado un/una" + superAnaconda.getType());
    }
}
}

  