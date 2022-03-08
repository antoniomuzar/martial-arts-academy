package antonio.martialartsacademy.repositories;

import antonio.martialartsacademy.model.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact,Long> {

    Contact findByLastName(String lastName);

    List<Contact> findByLastNameLike(String lastName);
}
