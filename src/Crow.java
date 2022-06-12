public class Crow extends Bird implements Flyable {
    Flyable commonfly = new Commonfly();

    @Override
    public void eat(){
        super.eat();
    }

    @Override
    public void makeSound(){
        super.makeSound();
    }

    @Override
    public void fly() {
        commonfly.fly();
    }
}
