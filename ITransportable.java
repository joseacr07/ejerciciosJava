public interface ITransportable {
       
   void move();
   void stop();
   void eat();
   //void seeAnimals();
   void getVolume(double largo, double ancho, double alto);
   double getWeight(double kg);
  
}

/*1. crear una interfaz ITransportable que tenga los métodos move(), stop(), getWeight(), getVolume()

2. En esta nueva versión del programa, el método store() de la clase Ark tendrá que aceptar cualquier instancia de objeto que implemente la interfaz ITransportable 
   (habrá que aportar las modificaciones necesarias al código del método y de las clases de los animales existentes)

3. Crear una nueva clase Food que reprsentará la comida para los animales. 

   Esta clase deberá implementar la interfaz ITransportable para poder entrar en el Arca. */