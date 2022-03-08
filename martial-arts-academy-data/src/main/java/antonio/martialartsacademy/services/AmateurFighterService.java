package antonio.martialartsacademy.services;

import antonio.martialartsacademy.model.AmateurFighter;

import java.util.List;

public interface AmateurFighterService  extends CrudService<AmateurFighter, Long > {


    AmateurFighter findByLastName(String lastName);

    List<AmateurFighter> findByLastNameLike(String lastName);
}
