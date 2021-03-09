import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        flyBehaviour = new FlyWithWings();

        FlyBehaviour flyBehaviour;

    }

    @Override
    public void display() {
        System.out.println("Я красноголовая утка");
    }
}
