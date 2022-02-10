package antonio.martialartsacademydata.model;

import java.util.HashSet;
import java.util.Set;

public class Fighter extends Person{

    private Set<FighterSpecialty> specialities = new HashSet<>();

    public Set<FighterSpecialty> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<FighterSpecialty> specialities) {
        this.specialities = specialities;
    }
}
