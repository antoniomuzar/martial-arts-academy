package antonio.martialartsacademy.bootstrap;

import antonio.martialartsacademy.model.*;
import antonio.martialartsacademy.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
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



     CoachSpecialty headCoachSpecialty = new CoachSpecialty();
     headCoachSpecialty.setDescription("Martial arts Boss");
     CoachSpecialty savedHeadCoachSpecialty = coachSpecialtyService.save(headCoachSpecialty);

     CoachSpecialty kickboxingSpecialty = new CoachSpecialty();
     kickboxingSpecialty.setDescription("Stricking guru");
     CoachSpecialty savedKickboxingSpecialty = coachSpecialtyService.save(kickboxingSpecialty);

     CoachSpecialty wrestlingSpecialty = new CoachSpecialty();
     wrestlingSpecialty.setDescription("Wrestling eagle");
     CoachSpecialty savedWrestlingSpecialty = coachSpecialtyService.save(wrestlingSpecialty);

     CoachSpecialty jiuJitsuSpecialty = new CoachSpecialty();
     jiuJitsuSpecialty.setDescription("Snake on the ground");
     CoachSpecialty savedJiuJitsuSpecialty = coachSpecialtyService.save(jiuJitsuSpecialty);


     Coach headCoach=new Coach();
     headCoach.setId(1L);
     headCoach.setFirstName("Conan");
     headCoach.setLastName("Silveira");
     headCoach.setCountry("Brazil");
     headCoach.getSpecialties().add(savedHeadCoachSpecialty);

     coachService.save(headCoach);

     Coach kickboxingCoach = new Coach();
     kickboxingCoach.setId(2L);
     kickboxingCoach.setFirstName("Peter");
     kickboxingCoach.setLastName("Van Aerts");
     kickboxingCoach.setCountry("Netherlands");
     kickboxingCoach.getSpecialties().add(savedKickboxingSpecialty);

     coachService.save(kickboxingCoach);


     Coach wrestlingCoach = new Coach();
     wrestlingCoach.setId(3L);
     wrestlingCoach.setFirstName("Christan");
     wrestlingCoach.setLastName("Magashvili");
     wrestlingCoach.setCountry("Georgia");
     wrestlingCoach.getSpecialties().add(savedWrestlingSpecialty);


     coachService.save(wrestlingCoach);

     Coach jiuJitsuCoach= new Coach();
     jiuJitsuCoach.setId(4L);
     jiuJitsuCoach.setFirstName("Thiago");
     jiuJitsuCoach.setLastName("Gracie");
     jiuJitsuCoach.setCountry("Brazil");
     jiuJitsuCoach.getSpecialties().add(savedJiuJitsuSpecialty);

     coachService.save(jiuJitsuCoach);

     System.out.println("Loading coaches...");

     Fighter mmaFighter1= new Fighter();
     mmaFighter1.setId(1L);
     mmaFighter1.setFirstName("Yair");
     mmaFighter1.setLastName("Reyes");
     mmaFighter1.setSpecialty("Wrestling");
     mmaFighter1.setCountry("Mexico");
     mmaFighter1.setWorldRanking("2");
     mmaFighter1.setFightingOrganization("TFC- Total Fighting Organization");

     fighterService.save(mmaFighter1);

     Fighter mmaFighter2 = new Fighter();
     mmaFighter2.setId(2L);
     mmaFighter2.setFirstName("Igor");
     mmaFighter2.setLastName("Horvat");
     mmaFighter2.setCountry("Croatia");
     mmaFighter2.setSpecialty("All round");
     mmaFighter2.setWorldRanking("9");
     mmaFighter2.setFightingOrganization("MMAO- Mixed martial arts organization");

     fighterService.save(mmaFighter2);

     Fighter mmaFighter3= new Fighter();
     mmaFighter3.setId(3L);
     mmaFighter3.setFirstName("Anthony");
     mmaFighter3.setLastName("Razum");
     mmaFighter3.setSpecialty("Knockout power");
     mmaFighter3.setCountry("Croatia");
     mmaFighter3.setWorldRanking("1");
     mmaFighter3.setFightingOrganization("FNO- Fight Of Nation Organization");

     fighterService.save(mmaFighter3);


     Fighter mmaFighter4= new Fighter();
     mmaFighter4.setId(4L);
     mmaFighter4.setFirstName("Hugo");
     mmaFighter4.setLastName("Gracie");
     mmaFighter4.setSpecialty("Ground game");
     mmaFighter4.setCountry("Brazil");
     mmaFighter4.setWorldRanking("7");
     mmaFighter4.setFightingOrganization("CFO- Centurion Fighting Organization");

     fighterService.save(mmaFighter4);

     System.out.println("Loaded fighters");


    }
}
