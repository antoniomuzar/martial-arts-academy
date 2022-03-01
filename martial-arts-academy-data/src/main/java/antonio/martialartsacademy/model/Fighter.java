package antonio.martialartsacademy.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="fighters")
public class Fighter extends Person {

    @Builder
    public Fighter(Long id, String firstName, String lastName, String country, String worldRanking, String specialty, String fightingOrganization) {
        super(id, firstName, lastName);
        this.country = country;
        this.worldRanking = worldRanking;
        this.specialty = specialty;
        this.fightingOrganization= fightingOrganization;

    }

    @Column(name="current_gym")
    private String fightingOrganization;

    @Column(name = "country")
    private String country;

    @Column(name = "world_ranking")
    private String worldRanking;

    @Column(name="specialty")
    private String specialty;



}




