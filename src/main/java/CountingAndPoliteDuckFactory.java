//6510405822 sarawut inpol
public class CountingAndPoliteDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new QuackCounter(new PoliteQuack(new MallardDuck()));
    }
    public Quackable createRedheadDuck() {
        return new QuackCounter(new PoliteQuack(new RedheadDuck()));
    }
    public Quackable createRubberDuck() {
        return new QuackCounter(new PoliteQuack(new RubberDuck()));
    }
}