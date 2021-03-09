import org.springframework.boot.SpringBootConfiguration;

//сделать работу через spring!

public class MiniDuckSim {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck red = new RedHeadDuck();
        red.display();
        red.performFly();
        red.performQuack();

        Duck rub = new RubberDuck();
        rub.display();
        rub.performQuack();
        rub.performFly();
    }
}
