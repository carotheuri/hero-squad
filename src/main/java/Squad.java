import java.time.LocalDateTime;
import java.util.ArrayList;

public class Squad {
    private int max_size;
    private int initial_size;
    private String squad_name;
    private String squad_cause;
    private static ArrayList<Squad> instances = new ArrayList<>();
    private boolean is_activated;
    private LocalDateTime createdAt;
    private int id;

    public Squad(int max_size, int initial_size, String squad_name, String squad_cause) {
        this.max_size = max_size;
        this.initial_size = initial_size;
        this.squad_name = squad_name;
        this.squad_cause = squad_cause;
    }

    public int getMax_size() {
        return max_size;
    }

    public int getInitial_size() {
        return initial_size;
    }

    public String getSquad_name() {
        return squad_name;
    }

    public String getSquad_cause() {
        return squad_cause;
    }

    public static ArrayList<Squad> getInstances() {
        return instances;
    }

    public boolean isIs_activated() {
        return is_activated;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }
}