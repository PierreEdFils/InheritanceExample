public class Main {
    public static void main(String[] args) {
       Dog d = new Dog("Loafer",1,1,50,250,2,4,1,40,"Silky Coat");
       d.chew();
       d.walk();
       d.run();

       Fish f = new Fish("jelly",1,1,20,10,5,2,5);
       f.rest();
       f.swim(8);

    }
}