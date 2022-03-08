package antonio.martialartsacademy.services;

import antonio.martialartsacademy.model.Contact;

import java.util.List;

public interface ContactService  extends CrudService<Contact, Long>{

    Contact findByLastName(String lastName);

    List<Contact> findByLastNameLike(String lastName);
}
