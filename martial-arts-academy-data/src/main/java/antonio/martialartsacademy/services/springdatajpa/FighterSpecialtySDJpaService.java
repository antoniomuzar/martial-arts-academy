package antonio.martialartsacademy.services.springdatajpa;

import antonio.martialartsacademy.model.FighterSpecialty;
import antonio.martialartsacademy.repositories.FighterSpecialtyRepository;
import antonio.martialartsacademy.services.FighterSpecialtyService;
import org.springframework.context.annotation.Profile;
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
        Set<FighterSpecialty>specialties= new HashSet<>();
        fighterSpecialtyRepository.findAll().forEach(specialties::add);
        return specialties;
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
