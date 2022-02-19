package antonio.martialartsacademydata.services.map;

import antonio.martialartsacademydata.model.Coach;
import antonio.martialartsacademydata.model.Fighter;
import antonio.martialartsacademydata.model.FighterSpecialty;
import antonio.martialartsacademydata.services.FighterService;
import antonio.martialartsacademydata.services.FighterSpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@Profile({"default", "map"})
public class FighterMapService extends AbstractMapService<Fighter, Long> implements FighterService {

    private final FighterSpecialtyService fighterSpecialtyService;

    public FighterMapService(FighterSpecialtyService fighterSpecialtyService) {
        this.fighterSpecialtyService = fighterSpecialtyService;
    }


    @Override
    public Set<Fighter> findAll() {
        return super.findAll();
    }

    @Override
    public Fighter findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Fighter save(Fighter object) {
        return super.save(object);
    }

    @Override
    public void delete(Fighter object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Fighter findByLastName(String lastName) {
        return this.findAll()
                .stream()
                .filter(fighter -> fighter.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Fighter> findByLastNameLike(String lastName) {
        return null;
    }
}


