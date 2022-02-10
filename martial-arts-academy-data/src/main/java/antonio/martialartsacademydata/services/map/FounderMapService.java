package antonio.martialartsacademydata.services.map;

import antonio.martialartsacademydata.model.Founder;
import antonio.martialartsacademydata.services.FounderService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Set;

@Component
public class FounderMapService extends AbstractMapService<Founder, Long> implements FounderService {


    @Override
    public Set<Founder> findAll() {
        return super.findAll();
    }

    @Override
    public Founder findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Founder save(Founder object) {
        return super.save(object);
    }

    @Override
    public void delete(Founder object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Founder findByLastName(String lastName) {
        return null;
    }
}
