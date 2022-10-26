public class Food implements ITransportable {
    static int grass = 10;
    static int meat = 20;
    static int fruits = 30;
    static int water = 40;
    

    class grass extends Food {
        public grass(){
        super();
        grass = 10;
    }
    }
    @Override
    public void move() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void eat() {
        System.out.println(water);

    }

   /* @Override
    public void seeAnimals() {
    }*/

    @Override
    public void getVolume(double largo, double ancho, double alto) {

    }

    @Override
    public double getWeight(double kg) {
        // TODO Auto-generated method stub
        return 0;
    }

}
