package antonio.martialartsacademy.model;

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


    @Column(name="country")
    private String country;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name ="coach_specialties", joinColumns = @JoinColumn(name = "coach_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<CoachSpecialty> specialties = new HashSet<>();


}