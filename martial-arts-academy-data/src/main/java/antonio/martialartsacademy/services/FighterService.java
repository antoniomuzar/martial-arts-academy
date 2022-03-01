package antonio.martialartsacademy.services;

import antonio.martialartsacademy.model.Fighter;

import java.util.List;


public interface FighterService extends CrudService<Fighter,Long>{

    Fighter findByLastName(String lastName);

    List<Fighter> findByLastNameLike(String lastName);
}
