package antonio.martialartsacademy.services.map;

import antonio.martialartsacademy.model.Contact;
import antonio.martialartsacademy.services.ContactService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@Profile({"default", "map"})
public class ContactMapService extends AbstractMapService<Contact, Long> implements ContactService {


    @Override
    public Set<Contact> findAll() {
        return super.findAll();
    }

    @Override
    public Contact findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Contact save(Contact object) {
        return super.save(object);
    }

    @Override
    public void delete(Contact object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Contact findByLastName(String lastName) {
        return this.findAll()
                .stream()
                .filter(contact -> contact.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Contact> findByLastNameLike(String lastName) {
        return null;
    }
}
