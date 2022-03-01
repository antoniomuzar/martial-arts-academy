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
@Table(name="fighter_specialty")
public class FighterSpecialty extends BaseEntity{

    @Column(name = "description")
    private String description;


}
