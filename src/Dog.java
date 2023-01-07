public class Dog extends Animal {

    private int eyes;
    private int  legs;
    private int tail;
    private int teeth;
    private String SkinCoat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String skinCoat) {
        super(name,1,1,size,weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        SkinCoat = skinCoat;
    }

    public  void chew(){
        eat();
        System.out.println("Dog chew it's food.");

    }

    public  void walk(){
        move(5);
        System.out.println("Dog.walk () is called.");
;
    }

    public void run() {
        move(15);
        System.out.println("Dog.run() is called. Dog is running at  15 mph.");
    }
}
