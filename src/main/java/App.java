import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad1 = new Squad(4,2,"WarFight","Fight all ongoing war");
            Squad squad2 = new Squad(10,5,"WarDefense","Defend Citizens and Evacuate them for Safety");
            Squad squad3 = new Squad(3,3,"Drusco","Fight Drug Addiction and help citizens reform");
            Squad squad4 = new Squad(2,3,"Hungro","Eradicate hunger by carrying out different initiatives");
            ArrayList<Squad> squads = Squad.getAll();
            model.put("squads", squads);
            return new ModelAndView(model, "layout.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
