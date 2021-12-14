import java.util.ArrayList;
import java.util.List;
// Tasks:
// Britney Spears - Singer - USA - 1981 - 40
// Antonio Banderas - Actor - Spain - Alive
// Conchita Wurst - Singer - Austria - Alive
// Luciano Pavarotti - Singer - Italian - Alive
// Barack Obama - Politician - USA - Alive
// Fidel Castro - Politician - Cuba - Dead

//1. Map each celebrity's name (just the name for now) to the Celebrity object. Tip: assert there are 6 celebrities
//2. Add profession to the Celebrity object.  Tip: assert there are 3 singer
//3. Add country to the Celebrity object.  Tip: assert there are 2 US citizen
//4. Add a function that returns the citizenship of each character (e.g. Spain -> Spanish; USA -> American).
// Tip: assert there are 2 US citizen
//5. Add birth year and age to the celebrity object.  Add a method to calculate whether the person is alive or
// dead. Tip: Assert only one is dead

 class Celebrity {
     private String name;

     public Celebrity(String name) {
         this.name = name;
     }
 }


public class CelebrityGenerator {

    public List<Celebrity> getCelebrities(){
        List<Celebrity> celebrities = new ArrayList<>();
        celebrities.add(new Celebrity("Britney Spears"));
        celebrities.add(new Celebrity("Antonio Banderas"));
        celebrities.add(new Celebrity("Conchita Wurst"));
        celebrities.add(new Celebrity("Luciano Pavarotti"));
        celebrities.add(new Celebrity("Barack Obama"));
        celebrities.add(new Celebrity("Fidel Castro"));

        return celebrities;
    }
}
