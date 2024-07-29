//6510405822 sarawut inpol
import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();
    Quackable leader;

    public void add(Quackable quacker) {
        if (quackers.isEmpty()) {
            leader = quacker;
        }
        quackers.add(quacker);
    }

    public void quack() {
        Iterator iterator = quackers.iterator();
        if (leader != null) {
            for (int i = 0; i < 3; i++) {
                leader.quack();
            }
        }
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            if (quacker != leader) {
                quacker.quack();
            }
        }
    }
}