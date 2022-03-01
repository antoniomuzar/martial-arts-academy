package antonio.martialartsacademy.services.map;

import antonio.martialartsacademy.model.FighterSpecialty;
import antonio.martialartsacademy.services.FighterSpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
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
