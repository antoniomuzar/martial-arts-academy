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
@Table(name="amateur_fighters")
public class AmateurFighter extends Person {

    @Builder
    public AmateurFighter(Long id, String firstName, String lastName , String phoneNumber, String email) {
        super(id, firstName, lastName);
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="email")
    private String email;



}
