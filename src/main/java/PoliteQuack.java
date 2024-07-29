//6510405822 sarawut inpol
public class PoliteQuack implements Quackable {
    Quackable duck;

    public PoliteQuack(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        System.out.println("ka");
    }
}