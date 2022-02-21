package antonio.martialartsacademydata.repositories;

import antonio.martialartsacademydata.model.Coach;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


public interface CoachRepository extends CrudRepository<Coach,Long > {

    Coach findByLastName(String lastName);

    List<Coach> findAllByLastNameLike(String lastName);
}
