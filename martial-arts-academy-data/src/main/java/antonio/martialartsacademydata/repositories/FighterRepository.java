package antonio.martialartsacademydata.repositories;

import antonio.martialartsacademydata.model.Coach;
import antonio.martialartsacademydata.model.Fighter;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FighterRepository extends CrudRepository<Fighter, Long> {

    Fighter findByLastName(String lastName);

    List<Fighter> findAllByLastNameLike(String lastName);
}
