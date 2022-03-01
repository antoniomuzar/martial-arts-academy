package antonio.martialartsacademy.services.map;

import antonio.martialartsacademy.model.Coach;
import antonio.martialartsacademy.model.CoachSpecialty;
import antonio.martialartsacademy.services.CoachService;
import antonio.martialartsacademy.services.CoachSpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Set;

@Service
@Profile({"default", "map"})
public class CoachMapService extends AbstractMapService<Coach,Long> implements CoachService {


    private final CoachSpecialtyService coachSpecialtyService;

    public CoachMapService(CoachSpecialtyService coachSpecialtyService) {
        this.coachSpecialtyService = coachSpecialtyService;
    }

    @Override
    public Set<Coach> findAll() {
        return super.findAll();
    }

    @Override
    public Coach findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Coach save(Coach object) {
        if(object.getSpecialties().size() > 0){
            object.getSpecialties().forEach(coachSpecialty -> {
                if(coachSpecialty.getId() == null){
                    CoachSpecialty savedCoachSpecialty= coachSpecialtyService.save(coachSpecialty);
                    coachSpecialty.setId(savedCoachSpecialty.getId());

                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Coach object) {
         super.delete(object);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Coach findByLastName(String lastName) {
        return this.findAll()
                .stream()
                .filter(coach -> coach.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Coach> findByLastNameLike(String lastName) {
        return null;
    }
}
