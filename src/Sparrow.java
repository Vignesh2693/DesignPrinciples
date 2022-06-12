public class Sparrow extends Bird implements Flyable{
    private final Flyable myfly;
    Sparrow(Flyable f){
        this.myfly = f;
    }
    @Override
    public void fly() {
        this.myfly.fly();
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
