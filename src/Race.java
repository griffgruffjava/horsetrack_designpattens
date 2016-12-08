import java.util.List;

/**
 * Created by Finbar on 08/12/2016.
 */
public class Race {

    private List<Horse> horses;
    private Long id;

    public Race() {
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    public void addHorse(Horse horse){
        horses.add(horse);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
