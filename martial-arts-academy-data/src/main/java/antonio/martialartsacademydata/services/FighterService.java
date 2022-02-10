package antonio.martialartsacademydata.services;

import antonio.martialartsacademydata.model.Fighter;



public interface FighterService extends CrudService<Fighter,Long>{

    Fighter findByLastName(String lastName);
}
