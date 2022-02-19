package antonio.martialartsacademyweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"antonio.martialartsacademyweb.controllers","antonio.martialartsacademydata.services"
        ,"antonio.martialartsacademydata.repositories" })

public class MartialArtsAcademyWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(MartialArtsAcademyWebApplication.class, args);
    }

}
