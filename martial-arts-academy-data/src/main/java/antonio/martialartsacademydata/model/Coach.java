package antonio.martialartsacademydata.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="coaches")
public class Coach extends Person {

    @Column(name="country")
    private String country;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "coach")
    private Set<CoachSpecialty> specialities = new HashSet<>();

    public Set<CoachSpecialty> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<CoachSpecialty> specialities) {
        this.specialities = specialities;




    }

}