import org.graalvm.compiler.serviceprovider.ServiceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Configuration
public class FlyNoWay implements FlyBehaviour {

    @Override
    @Bean
    public void fly() {
        System.out.println("Лечу");
    }
}
