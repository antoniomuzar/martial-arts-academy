package antonio.martialartsacademydata.model;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="coach_specialty")
public class CoachSpecialty extends BaseEntity{


    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name="coach_id")
    private Coach coach;



}
