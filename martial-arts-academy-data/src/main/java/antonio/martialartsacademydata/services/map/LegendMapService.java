package antonio.martialartsacademydata.services.map;


import antonio.martialartsacademydata.model.Legend;
import antonio.martialartsacademydata.services.LegendService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Set;

@Component
public class LegendMapService extends AbstractMapService<Legend,Long>implements LegendService {


    @Override
    public Set<Legend> findAll() {
        return super.findAll();
    }

    @Override
    public Legend findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Legend save(Legend object) {
        return super.save(object);
    }

    @Override
    public void delete(Legend object) {

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Legend findByLastName(String lastName) {
        return null;
    }
}
