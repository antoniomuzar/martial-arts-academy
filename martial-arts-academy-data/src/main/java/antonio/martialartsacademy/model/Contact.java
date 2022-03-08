package antonio.martialartsacademy.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="contact")
public class Contact extends Person{

    @Builder
    public Contact(Long id, String firstName, String lastName, String email, String message) {
        super(id, firstName, lastName);
        this.email=email;
        this.message=message;
    }

    @Column(name="email")
    private String email;

    @Column(name="message")
    private String message;



}
