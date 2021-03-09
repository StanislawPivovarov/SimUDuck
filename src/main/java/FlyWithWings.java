import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
public class FlyWithWings implements FlyBehaviour {

    @Override
    @Bean
    public void fly() {
        System.out.println("не лечу");
    }
}
