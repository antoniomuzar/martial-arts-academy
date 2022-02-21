package antonio.martialartsacademydata.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="fighter_specialties")
public class FighterSpecialty extends BaseEntity{

    public FighterSpecialty(Long id, String description) {
        super(id);
        this.description = description;
    }

    @Column(name="description")
    private String description;


}
