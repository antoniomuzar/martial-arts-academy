package antonio.martialartsacademydata.model;

import java.util.HashSet;
import java.util.Set;

public class Coach extends Person {


    private Set<CoachSpecialty> specialities = new HashSet<>();

    public Set<CoachSpecialty> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<CoachSpecialty> specialities) {
        this.specialities = specialities;




    }

}