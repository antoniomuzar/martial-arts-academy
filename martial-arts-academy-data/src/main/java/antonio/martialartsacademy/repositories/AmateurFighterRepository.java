package antonio.martialartsacademy.repositories;

import antonio.martialartsacademy.model.AmateurFighter;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AmateurFighterRepository  extends CrudRepository<AmateurFighter,Long> {

    AmateurFighter findByLastName(String lastName);

    List<AmateurFighter> findAllByLastNameLike(String lastName);
}
