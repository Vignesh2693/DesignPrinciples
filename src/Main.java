public class Main {
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon();
        Crow crow = new Crow();
        Sparrow sparrow = new Sparrow(new Commonfly());
        Bird ostrich = new Ostrich();
        Bird penguin = new Penguin();
        crow.commonfly.fly();
        sparrow.fly();
        pigeon.fly();
        ostrich.eat();
        penguin.makeSound();
    }
}
