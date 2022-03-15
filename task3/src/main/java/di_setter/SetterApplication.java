package di_setter;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SetterApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(VehicleConfig.class);
        var helicopter = context.getBean(Helicopter.class);
        System.out.println(helicopter.startVehilce());
    }
}
