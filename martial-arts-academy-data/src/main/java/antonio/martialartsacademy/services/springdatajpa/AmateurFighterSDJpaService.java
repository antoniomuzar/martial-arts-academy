package antonio.martialartsacademy.services.springdatajpa;

import antonio.martialartsacademy.model.AmateurFighter;
import antonio.martialartsacademy.repositories.AmateurFighterRepository;
import antonio.martialartsacademy.services.AmateurFighterService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class AmateurFighterSDJpaService implements AmateurFighterService {

    private final AmateurFighterRepository amateurFighterRepository;

    public AmateurFighterSDJpaService(AmateurFighterRepository amateurFighterRepository) {
        this.amateurFighterRepository = amateurFighterRepository;
    }


    @Override
    public Set<AmateurFighter> findAll() {
        Set<AmateurFighter>amateurFighters= new HashSet<>();
        amateurFighterRepository.findAll().forEach(amateurFighters::add);
        return amateurFighters;
    }

    @Override
    public AmateurFighter findById(Long aLong) {
        return amateurFighterRepository.findById(aLong).orElse(null);
    }

    @Override
    public AmateurFighter save(AmateurFighter object) {
        return amateurFighterRepository.save(object);
    }

    @Override
    public void delete(AmateurFighter object) {
        amateurFighterRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        amateurFighterRepository.deleteById(aLong);

    }

    @Override
    public AmateurFighter findByLastName(String lastName) {
        return amateurFighterRepository.findByLastName(lastName);
    }

    @Override
    public List<AmateurFighter> findByLastNameLike(String lastName) {
        return amateurFighterRepository.findAllByLastNameLike(lastName);
    }
}
