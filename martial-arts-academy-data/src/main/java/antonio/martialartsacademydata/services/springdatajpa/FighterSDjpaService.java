package antonio.martialartsacademydata.services.springdatajpa;

import antonio.martialartsacademydata.model.Fighter;
import antonio.martialartsacademydata.repositories.FighterRepository;
import antonio.martialartsacademydata.services.FighterService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class FighterSDjpaService implements FighterService {

    private final FighterRepository fighterRepository;

    public FighterSDjpaService(FighterRepository fighterRepository) {
        this.fighterRepository = fighterRepository;
    }

    @Override
    public Set<Fighter> findAll() {
        Set<Fighter>fighter= new HashSet<>();
        fighterRepository.findAll().forEach(fighter::add);
        return fighter;
    }

    @Override
    public Fighter findById(Long aLong) {
        return fighterRepository.findById(aLong).orElse(null);

    }

    @Override
    public Fighter save(Fighter object) {
        return fighterRepository.save(object);
    }

    @Override
    public void delete(Fighter object) {
        fighterRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        fighterRepository.deleteById(aLong);

    }

    @Override
    public Fighter findByLastName(String lastName) {
        return fighterRepository.findByLastName(lastName);
    }


    @Override

    public List<Fighter> findByLastNameLike(String lastName){
        return fighterRepository.findAllByLastNameLike(lastName);
    }
}
