package antonio.martialartsacademydata.services.springdatajpa;

import antonio.martialartsacademydata.model.CoachSpecialty;
import antonio.martialartsacademydata.repositories.CoachSpecialtyRepository;
import antonio.martialartsacademydata.services.CoachSpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Component
@Profile("springdatajpa")
public class CoachSpecialtySDJpaService implements CoachSpecialtyService {

    private final CoachSpecialtyRepository coachSpecialtyRepository;

    public CoachSpecialtySDJpaService(CoachSpecialtyRepository coachSpecialtyRepository) {
        this.coachSpecialtyRepository = coachSpecialtyRepository;

    }

    @Override
    public Set<CoachSpecialty> findAll() {
        Set<CoachSpecialty>specialties = new HashSet<>();
        coachSpecialtyRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public CoachSpecialty findById(Long aLong) {
        return coachSpecialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public CoachSpecialty save(CoachSpecialty object) {
        return coachSpecialtyRepository.save(object);
    }

    @Override
    public void delete(CoachSpecialty object) {
        coachSpecialtyRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        coachSpecialtyRepository.deleteById(aLong);
    }

}
