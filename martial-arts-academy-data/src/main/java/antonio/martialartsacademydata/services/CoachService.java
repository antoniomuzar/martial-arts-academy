package antonio.martialartsacademydata.services;

import antonio.martialartsacademydata.model.Coach;

import java.util.List;
import java.util.Set;


public interface CoachService extends CrudService<Coach,Long> {


    Coach findByLastName(String lastName);

    List<Coach> findByLastNameLike(String lastName);





}
