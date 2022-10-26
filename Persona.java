public class Persona{
    private String _nombre; //parametros que se pasan con .this
    private String _nacionalidad;
   
    public Persona(String nombre, String nacionalidad){
        this._nombre = nombre;
        this._nacionalidad = nacionalidad;
    }

public void saludar(String amigo){ //amigo es un parametro de saludar
    System.out.println(" hola! " + amigo + " me llamo " + this._nombre  + " y soy " + this._nacionalidad);
}
}