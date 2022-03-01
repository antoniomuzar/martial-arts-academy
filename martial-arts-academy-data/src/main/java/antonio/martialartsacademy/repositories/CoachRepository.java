package antonio.martialartsacademy.repositories;

import antonio.martialartsacademy.model.Coach;
import org.springframework.data.repository.CrudRepository;



import java.util.List;


public interface CoachRepository extends CrudRepository<Coach,Long > {

    Coach findByLastName(String lastName);

    List<Coach> findAllByLastNameLike(String lastName);
}
