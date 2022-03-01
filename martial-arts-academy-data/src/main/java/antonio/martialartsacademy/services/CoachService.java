package antonio.martialartsacademy.services;

import antonio.martialartsacademy.model.Coach;


import java.util.List;


public interface CoachService extends CrudService<Coach,Long> {


    Coach findByLastName(String lastName);

    List<Coach> findByLastNameLike(String lastName);





}
