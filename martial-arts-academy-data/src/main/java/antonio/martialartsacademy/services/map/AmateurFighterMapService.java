package antonio.martialartsacademy.services.map;


import antonio.martialartsacademy.model.AmateurFighter;
import antonio.martialartsacademy.services.AmateurFighterService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


@Service
@Profile({"default", "map"})
public class AmateurFighterMapService extends AbstractMapService<AmateurFighter,Long>implements AmateurFighterService {





    @Override
    public Set<AmateurFighter> findAll() {
        return super.findAll();
    }

    @Override
    public AmateurFighter findById(Long id) {
        return super.findById(id);
    }

    @Override
    public AmateurFighter save(AmateurFighter object) {
        return super.save(object);
    }

    @Override
    public void delete(AmateurFighter object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public AmateurFighter findByLastName(String lastName) {
        return this.findAll()
                .stream()
                .filter(amateurFighter -> amateurFighter.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<AmateurFighter> findByLastNameLike(String lastName) {
        return null;
    }
}
