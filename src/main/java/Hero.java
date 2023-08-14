import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hero {
    private String hero_name;
    private String hero_age;
    private int hero_power;
    private int hero_weakness;
    private static ArrayList<Hero> instances = new ArrayList<>();

    private int squad_id;
    private static ArrayList<Squad> squadinstances;
    private boolean is_activated;
    private LocalDateTime createdAt;
    private int id;

    public Hero(String hero_name, String hero_age, int hero_power, int hero_weakness,int squad_id,ArrayList<Squad> all_squads) {
        this.hero_name = hero_name;
        this.hero_age = hero_age;
        this.hero_power = hero_power;
        this.hero_weakness = hero_weakness;
        squadinstances = all_squads;
        instances.add(this);
        this.id = instances.size();
        this.squad_id  = squad_id;
    }

    public String getHero_name() {
        return hero_name;
    }

    public String getHero_Score() {
        double score = (hero_power+hero_weakness)/2;
        if(Math.round(score) == 1){
            return "1st Line Support";
        }
        else if(Math.round(score) == 2){
            return "2nd Line Support";
        }
        else{
            return "3rd Line Support";
        }
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
    public int is_Squad_Max_Exceeded(){
        int MaxSize;
        Map<Integer,Integer> squadTracker = new HashMap<Integer, Integer>();
        //Create a hashmap with number of occurrences of an object
        for(Hero hero : instances){
            if(!squadTracker.containsKey(squad_id)){
                squadTracker.put(squad_id,0);
            }
            else{
                int heroInstance = squadTracker.get(squad_id) + 1;
                squadTracker.replace(squad_id, heroInstance);
            }
        }
        if(squadTracker.containsKey(squad_id)){
            int C
        }

        for (Squad squad : squadinstances) {
            if(squad.getId() == squad_id){
                MaxSize = squad.getMax_size();
            }
        }
    }
}
