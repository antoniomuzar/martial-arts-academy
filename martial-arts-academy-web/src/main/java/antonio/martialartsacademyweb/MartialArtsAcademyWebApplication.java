package antonio.martialartsacademyweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"antonio.martialartsacademydata.services"})
public class MartialArtsAcademyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MartialArtsAcademyWebApplication.class, args);
    }

}
