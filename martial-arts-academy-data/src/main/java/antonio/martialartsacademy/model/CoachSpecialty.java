package antonio.martialartsacademy.model;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="coach_specialty")
public class CoachSpecialty extends BaseEntity{

    @ManyToOne
    @JoinColumn(name="coach")
    private Coach coach;


    @Column(name="description")
    private String description;



}
