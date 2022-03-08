package antonio.martialartsacademy.services.springdatajpa;

import antonio.martialartsacademy.model.Contact;
import antonio.martialartsacademy.repositories.ContactRepository;
import antonio.martialartsacademy.services.ContactService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class ContactSDJpaService implements ContactService {

   private final ContactRepository contactRepository;

    public ContactSDJpaService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }


    @Override
    public Set<Contact> findAll() {
       Set<Contact> contact= new HashSet<>();
       contactRepository.findAll().forEach(contact::add);
       return contact;
    }

    @Override
    public Contact findById(Long aLong) {
        return contactRepository.findById(aLong).orElse(null);
    }

    @Override
    public Contact save(Contact object) {
        return contactRepository.save(object);
    }

    @Override
    public void delete(Contact object) {
        contactRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        contactRepository.deleteById(aLong);

    }

    @Override
    public Contact findByLastName(String lastName) {
        return contactRepository.findByLastName(lastName);
    }

    @Override
    public List<Contact> findByLastNameLike(String lastName) {
        return contactRepository.findByLastNameLike(lastName);
    }

}
