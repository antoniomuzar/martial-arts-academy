package antonio.martialartsacademyweb.bootstrap;

import antonio.martialartsacademydata.model.*;
import antonio.martialartsacademydata.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

@Component
@EnableAutoConfiguration


public class DataLoader  implements CommandLineRunner {

   private final CoachService coachService;
   private final FighterService fighterService;
   private final FighterSpecialtyService fighterSpecialtyService;
   private final CoachSpecialtyService coachSpecialtyService;
   private final FounderService founderService;
   private final LegendService legendService;

    public DataLoader(CoachService coachService, CoachSpecialtyService coachSpecialtyService,
                      FighterService fighterService, FighterSpecialtyService fighterSpecialtyService,
                      FounderService founderService, LegendService legendService) {

     this.coachService = coachService;
     this.coachSpecialtyService = coachSpecialtyService;
     this.fighterService = fighterService;
     this.fighterSpecialtyService = fighterSpecialtyService;
     this.founderService = founderService;
     this.legendService = legendService;
    }



    @Override
    public void run(String... args) throws Exception {


     Coach headCoach = new Coach();
     headCoach.setId(1L);
     headCoach.setFirstName("Conan");
     headCoach.setLastName("Silveira");


     coachService.save(headCoach);

     Coach kickboxingCoach = new Coach();
     kickboxingCoach.setId(2L);
     kickboxingCoach.setFirstName("Peter");
     kickboxingCoach.setLastName("Van Aerts");

     coachService.save(kickboxingCoach);


     Coach wrestlingCoach = new Coach();
     wrestlingCoach.setId(3L);
     wrestlingCoach.setFirstName("Magomed");
     wrestlingCoach.setLastName("Nurmagomedov");

     coachService.save(wrestlingCoach);

     Coach jiuJitsuCoach= new Coach();
     jiuJitsuCoach.setId(4L);
     jiuJitsuCoach.setFirstName("Thiago");
     jiuJitsuCoach.setLastName("Gracie");

     coachService.save(jiuJitsuCoach);

     System.out.println("Loading coaches...");


    }
}
