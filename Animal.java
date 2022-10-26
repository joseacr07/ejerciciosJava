    abstract class Animal {
    private String name;
    static int id = 0;
    private int age;
    private String raze;
    private String type;
   
    //private double weight;
    public Animal(String name, int age, String raze, String type) {
       // Animal.id++;
        this.name = name;
        this.age = age;
        this.raze = raze;
        this.type = type;
       
    }

    protected abstract void showInfo();

    protected void walk() {
      
        System.out.println(
        name + " está caminando");
   }
    protected void sit() {
    
    System.out.println(name + " está sentado");
}
    
    protected void fly() {
    
    System.out.println(name + " no quiere entrar en el arca, pero se posa en un madero de la misma.");
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getId() {
        return id;
    }

   public void setVolume(double volume) {
    }

      public static void setId(int id) {
        Animal.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRaze() {
        return raze;
    }

    public void setRaze(String raze) {
        this.raze = raze;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   
    

    /*public void store() {
        System.out.println("\n" + name + " ha ingresado al arca en la posición " + id + ".\nEs un/a " + raze
                + ". Tiene " + age + " años y es " + type);
    }*/

    /*
     * public void setName(String name, int age, String type, String raze) {
     * this.name = name;
     * this.age = age;
     * this.type = type;
     * this.raze = raze;
     * }
     */

}
