import java.time.LocalDateTime;
import java.util.ArrayList;

public class Hero {
    private String hero_name;
    private String hero_age;
    private int hero_power;
    private int hero_weakness;
    private static ArrayList<Hero> instances = new ArrayList<>();

    private static ArrayList<Squad> squadinstances;
    private boolean is_activated;
    private LocalDateTime createdAt;
    private int id;

    public Hero(String hero_name, String hero_age, int hero_power, int hero_weakness,ArrayList<Squad> all_squads) {
        this.hero_name = hero_name;
        this.hero_age = hero_age;
        this.hero_power = hero_power;
        this.hero_weakness = hero_weakness;
        squadinstances = all_squads;
        instances.add(this);
        this.id = instances.size();
    }

    public String getHero_name() {
        return hero_name;
    }

    public String getHero_age() {
        return hero_age;
    }

    public int getHero_power() {
        return hero_power;
    }

    public int getHero_weakness() {
        return hero_weakness;
    }

    public static ArrayList<Hero> getAll() {
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
