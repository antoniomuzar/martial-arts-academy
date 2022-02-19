package antonio.martialartsacademydata.services.springdatajpa;

import antonio.martialartsacademydata.model.FighterSpecialty;
import antonio.martialartsacademydata.repositories.FighterSpecialtyRepository;
import antonio.martialartsacademydata.services.FighterSpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class FighterSpecialtySDJpaService implements FighterSpecialtyService {

    private final FighterSpecialtyRepository fighterSpecialtyRepository;

    public FighterSpecialtySDJpaService(FighterSpecialtyRepository fighterSpecialtyRepository) {
        this.fighterSpecialtyRepository = fighterSpecialtyRepository;
    }

    @Override
    public Set<FighterSpecialty> findAll() {
        Set<FighterSpecialty>fighterSpecialties= new HashSet<>();
        fighterSpecialtyRepository.findAll().forEach(fighterSpecialties::add);
        return fighterSpecialties;
    }

    @Override
    public FighterSpecialty findById(Long aLong) {
        return fighterSpecialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public FighterSpecialty save(FighterSpecialty object) {
        return fighterSpecialtyRepository.save(object);
    }

    @Override
    public void delete(FighterSpecialty object) {
        fighterSpecialtyRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        fighterSpecialtyRepository.deleteById(aLong);

    }

}
