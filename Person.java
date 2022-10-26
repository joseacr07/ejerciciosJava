abstract class Person{
    private String name;
    private String lang;
    //inicializo el objeto
    public Person(String n, String l){
        this.name = n;
        this.lang = l;
    }
    public abstract void greetings();
}
class Italian extends Person{
    public Italian(String name){
        super(name, "italian");
    } 
    public void greetings(){
        System.out.println("Ciao!!!"); 
    }
    public void makeSpachetti(){
        System.out.println("Buonissimi!!!");
    }
}
class Spanish extends Person{
    public Spanish(String name){
        super(name, "spanish");
    } 
    public void greetings(){
        System.out.println("Hola!!!"); 
    }
    public void makePaella(){
        System.out.println("Rica rica!!!");
    }
}
class Catalan extends Person{
    public Catalan(String name){
        super(name, "catalan");
    } 
    public void greetings(){
        System.out.println("Bon dia!!!"); 
    }
    public void makePatumaka(){
        System.out.println("Qué bó!!!");
    }
}