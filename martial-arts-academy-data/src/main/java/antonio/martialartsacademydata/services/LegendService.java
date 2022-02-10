package antonio.martialartsacademydata.services;

import antonio.martialartsacademydata.model.Legend;


public interface LegendService extends CrudService<Legend, Long>{

    Legend findByLastName(String lastName);
}
