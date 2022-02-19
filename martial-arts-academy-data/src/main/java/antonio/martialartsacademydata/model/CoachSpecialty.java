package antonio.martialartsacademydata.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="coach_specialty")
public class CoachSpecialty extends BaseEntity{

    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name="coach_id")
    private Coach coach;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
