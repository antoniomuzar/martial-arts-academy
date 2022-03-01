package antonio.martialartsacademy.services.springdatajpa;

import antonio.martialartsacademy.model.Coach;
import antonio.martialartsacademy.repositories.CoachRepository;
import antonio.martialartsacademy.services.CoachService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class CoachSDJpaService implements CoachService {

    private final CoachRepository coachRepository;

    public CoachSDJpaService(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }

    @Override
    public Coach findByLastName(String lastName) {
        return coachRepository.findByLastName(lastName);
    }

    @Override
    public List<Coach> findByLastNameLike(String lastName) {
        return coachRepository.findAllByLastNameLike(lastName);
    }

    @Override
    public Set<Coach> findAll() {
       Set<Coach> coaches= new HashSet<>();
       coachRepository.findAll().forEach(coaches::add);
       return coaches;
    }

    @Override
    public Coach findById(Long aLong) {
        return coachRepository.findById(aLong).orElse(null);
    }

    @Override
    public Coach save(Coach object) {
        return coachRepository.save(object);
    }

    @Override
    public void delete(Coach object) {
        coachRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        coachRepository.deleteById(aLong);

    }
}
