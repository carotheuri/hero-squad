import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad1 = new Squad(4,"WarFight","Fight all ongoing war, when negotiations are not working");
            Squad squad2 = new Squad(10,"WarDefense","Defend Citizens and Evacuate them for Safety");
            Squad squad3 = new Squad(3,"Drusco","Fight Drug Addiction and help citizens reform");
            Squad squad4 = new Squad(2,"Hungro","Eradicate hunger by carrying out different initiatives");
            ArrayList<Squad> squads = Squad.getAll();
            model.put("squads", squads);
            return new ModelAndView(model, "layout.hbs");
        }, new HandlebarsTemplateEngine());
        get("/heroes/new", (request, response) -> { //URL to display form
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Squad> squads = Squad.getAll();
            model.put("squads", squads);
            return new ModelAndView(model, "newasset-form.hbs");
        }, new HandlebarsTemplateEngine());
        post("/heroes/new", (request, response) -> { //URL to make new post on POST route
            ArrayList<Squad> squads = Squad.getAll();
            Map<String, Object> model = new HashMap<String, Object>();
            int squad_id = Integer.parseInt(request.queryParams("squad"));
            String hero_name = request.queryParams("hero-name");
            String hero_age = request.queryParams("hero-age");
            int hero_power = Integer.parseInt(request.queryParams("hero-powers"));
            int hero_weakness = Integer.parseInt(request.queryParams("hero-weakness"));
            Hero newHero = new Hero(hero_name, hero_age,hero_power,hero_weakness,squad_id,squads);
            int currentSize = newHero.is_Squad_Max_Exceeded();
            Squad foundSquad = Squad.findById(squad_id); //use it to find task
            model.put("heroes", foundSquad);
            model.put("heroes",currentSize);
            model.put("heroes",newHero);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
