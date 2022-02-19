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
@Table(name="fighters")
public class Fighter extends Person{

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="fighter_specialties", joinColumns = @JoinColumn(name="fighter_id"),
            inverseJoinColumns = @JoinColumn(name="speciality_id"))
    private Set<FighterSpecialty> specialities = new HashSet<>();

    public Set<FighterSpecialty> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<FighterSpecialty> specialities) {
        this.specialities = specialities;
    }


}
