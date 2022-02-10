package antonio.martialartsacademydata.services.map;

import antonio.martialartsacademydata.model.Coach;
import antonio.martialartsacademydata.repositories.CoachRepository;
import antonio.martialartsacademydata.services.CoachService;
import antonio.martialartsacademydata.services.CoachSpecialtyService;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Set;

@Component
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
