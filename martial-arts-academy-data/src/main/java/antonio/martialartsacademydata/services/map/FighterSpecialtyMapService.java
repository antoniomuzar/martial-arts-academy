package antonio.martialartsacademydata.services.map;

import antonio.martialartsacademydata.model.FighterSpecialty;
import antonio.martialartsacademydata.services.FighterSpecialtyService;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class FighterSpecialtyMapService extends AbstractMapService<FighterSpecialty,Long> implements FighterSpecialtyService{



    @Override
    public Set<FighterSpecialty> findAll() {
        return super.findAll();
    }

    @Override
    public FighterSpecialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public FighterSpecialty save(FighterSpecialty object) {
        return super.save(object);
    }

    @Override
    public void delete(FighterSpecialty object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
