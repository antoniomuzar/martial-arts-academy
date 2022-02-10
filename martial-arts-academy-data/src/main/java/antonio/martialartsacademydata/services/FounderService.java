package antonio.martialartsacademydata.services;

import antonio.martialartsacademydata.model.Founder;


public interface FounderService extends CrudService<Founder, Long> {

    Founder findByLastName(String lastName);
}
