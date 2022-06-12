public class Pigeon extends Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("Pigeon flys in this way");
    }

    @Override
    public void eat(){
        super.eat();
    }

    @Override
    public void makeSound(){
        super.makeSound();
    }
}
