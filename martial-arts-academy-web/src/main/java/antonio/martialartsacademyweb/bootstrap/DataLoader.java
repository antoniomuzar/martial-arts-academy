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



    public DataLoader(CoachService coachService, CoachSpecialtyService coachSpecialtyService,
                      FighterService fighterService, FighterSpecialtyService fighterSpecialtyService
            ) {

     this.coachService = coachService;
     this.coachSpecialtyService = coachSpecialtyService;
     this.fighterService = fighterService;
     this.fighterSpecialtyService = fighterSpecialtyService;
    }



    @Override
    public void run(String... args) throws Exception {



     CoachSpecialty kickboxingSpecialty = new CoachSpecialty();
     kickboxingSpecialty.setDescription("Stricking guru");
     CoachSpecialty savedKickboxingSpecialty = coachSpecialtyService.save(kickboxingSpecialty);

     CoachSpecialty wrestlingSpecialty = new CoachSpecialty();
     wrestlingSpecialty.setDescription("Dagestan eagle");
     CoachSpecialty savedWrestlingSpecialty = coachSpecialtyService.save(wrestlingSpecialty);

     CoachSpecialty jiuJitsuSpecialty = new CoachSpecialty();
     jiuJitsuSpecialty.setDescription("Snake on the ground");
     CoachSpecialty savedJiuJitsuSpecialty = coachSpecialtyService.save(jiuJitsuSpecialty);


     FighterSpecialty wrestling = new FighterSpecialty();
     wrestling.setDescription("Dominant wrestling");
     FighterSpecialty savedWrestling = fighterSpecialtyService.save(wrestling);

     FighterSpecialty stricking = new FighterSpecialty();
     stricking.setDescription("All around Stricking");
     FighterSpecialty savedStricking = fighterSpecialtyService.save(stricking);


     FighterSpecialty knockoutPower = new FighterSpecialty();
     knockoutPower.setDescription("Knockout power");
     FighterSpecialty savedKnockoutPower = fighterSpecialtyService.save(knockoutPower);


     FighterSpecialty groundGame = new FighterSpecialty();
     groundGame.setDescription("Ground game");
     FighterSpecialty savedGroundGame = fighterSpecialtyService.save(groundGame);

     Coach headCoach=new Coach();
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

     Fighter mmaFighter1= new Fighter();
     mmaFighter1.setId(1L);
     mmaFighter1.setFirstName("Khamzat");
     mmaFighter1.setLastName("Mamaev");
     mmaFighter1.getSpecialities().add(savedWrestling);

     fighterService.save(mmaFighter1);

     Fighter mmaFighter2 = new Fighter();
     mmaFighter2.setId(2L);
     mmaFighter2.setFirstName("Igor");
     mmaFighter2.setLastName("Horvat");
     mmaFighter2.getSpecialities().add(savedStricking);

     fighterService.save(mmaFighter2);

     Fighter mmaFighter3= new Fighter();
     mmaFighter3.setId(3L);
     mmaFighter3.setFirstName("Anthony Razum");
     mmaFighter3.getSpecialities().add(savedKnockoutPower);

     fighterService.save(mmaFighter3);


     Fighter mmaFighter4= new Fighter();
     mmaFighter4.setId(3L);
     mmaFighter4.setFirstName("Hugo");
     mmaFighter4.setLastName("Gracie");
     mmaFighter4.getSpecialities().add(savedGroundGame);



    }
}
