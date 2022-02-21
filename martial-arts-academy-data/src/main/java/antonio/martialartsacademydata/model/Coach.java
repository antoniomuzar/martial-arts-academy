package antonio.martialartsacademydata.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="coaches")
public class Coach extends Person {

    @Builder
    public Coach(Long id, String firstName, String lastName, String country, Set<CoachSpecialty> specialities) {
        super(id, firstName, lastName);
        this.country = country;
        this.specialities = specialities;
    }

    @Column(name="country")
    private String country;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "coach")
    private Set<CoachSpecialty> specialities = new HashSet<>();


}