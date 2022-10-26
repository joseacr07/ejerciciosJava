import java.lang.reflect.Type;

abstract class Animal{
    //buena practica: clases en singular.
    //private String name;
    //serializar: una clase que se puede hacer una serie de clases... por eso se utiliza el singular 
    private String type;

    protected void setType(String t){
        this.type = t;
    }
    //comment 1

    public String getType(){
        return this.type;
    }



   /*  public Animal(String type){
        //this.name = name;
        this.type = type;
    } */

    public abstract void walk();
    public abstract void seat();
    //public abstract void store();
}
class Mamifero extends Animal{
     /**
     * @param t
     * @param type
     */
    Mamifero(String type, String t){
        //super("Mamifero");
        super.setType("Vaca genial");
    }
    public void walk(){
        System.out.println("ha entrado un mamifero");
    }
    public void seat(){
        System.out.println("Un mamifero se ha sentado");
    }
    
}

class Mitological extends Animal{
    public Mitological(String type, String t){
        //super("Mitological");
        super.setType("Gargoyle");
    }
    public void walk(){
        System.out.println("Un animal mitologico ha entrado");
    }
    public void seat(){
        System.out.println("Un animal mitologico se ha sentado");
    }
    
}

class Reptil extends Animal{
    public Reptil(String type, String t){
        //super("Reptil");
        super.setType("Super Serpiente");
    }
    public void walk(){
        System.out.println("Un reptil ha entrado");
    }
    public void seat(){
        System.out.println("Un reptil se ha sentado");
    }
}
