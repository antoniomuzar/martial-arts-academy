package antonio.martialartsacademydata.services.map;

import antonio.martialartsacademydata.model.CoachSpecialty;
import antonio.martialartsacademydata.services.CoachSpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class CoachSpecialtyMapService extends AbstractMapService<CoachSpecialty, Long> implements CoachSpecialtyService {

    @Override
    public Set<CoachSpecialty> findAll() {
        return super.findAll();
    }

    @Override
    public CoachSpecialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public CoachSpecialty save(CoachSpecialty object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
   public void delete(CoachSpecialty object) {
        super.delete(object);
    }
}
