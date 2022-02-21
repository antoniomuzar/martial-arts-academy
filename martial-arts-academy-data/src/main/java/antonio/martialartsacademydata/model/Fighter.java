package antonio.martialartsacademydata.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="fighters")
public class Fighter extends Person{

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="fighter_specialties", joinColumns = @JoinColumn(name="fighter_id"),
            inverseJoinColumns = @JoinColumn(name="speciality_id"))
    private Set<FighterSpecialty> specialities = new HashSet<>();



}
