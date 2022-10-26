public class Reptil extends Animal implements ITransportable {

    public Reptil(String name, int age, String raze, String type) {
        super(name, age, raze, type);
        /*
         * System.out.println(name + " ha ingresado al arca con el número " + id +
         * " ,tiene "+ age + " años, es " + type + " y su raza es " + raze);
         */
    }

    @Override
    protected void showInfo() {
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void eat() {
        System.out.println(getName() + " está comiendo hierba y frutas. La reserva de hierba es " + Food.grass-- + " y de frutas es " + Food.fruits--);
        
    }

    @Override
    public void seeAnimals() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getVolume(double largo, double ancho, double alto) {
        System.out.println(getName() + " ocupa un espacio de " + ((largo * ancho * alto) / 1000000) + " metros cuadrados dentro del arca");
    }

    @Override
    public double getWeight(double kg) {
        System.out.println(getName() + " es un " + getRaze() + " que pesa " + kg + " kilos.");
        return(kg);
        }

  
    }

 
  
   
 

    

