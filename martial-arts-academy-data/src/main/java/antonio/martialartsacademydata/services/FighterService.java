package antonio.martialartsacademydata.services;

import antonio.martialartsacademydata.model.Coach;
import antonio.martialartsacademydata.model.Fighter;

import java.util.List;


public interface FighterService extends CrudService<Fighter,Long>{

    Fighter findByLastName(String lastName);

    List<Fighter> findByLastNameLike(String lastName);
}
