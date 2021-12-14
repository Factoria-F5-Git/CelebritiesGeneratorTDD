import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class CelebrityTest {


    @Test
    public void testBase(){
        // Arrange - preparamos
        CelebrityGenerator generator = new CelebrityGenerator();
        List<Celebrity> celebrities = generator.getCelebrities();
        // Act- ejecutamos

        // Assert - comprobamos
        Assertions.assertTrue(1==1);
    }

    //1. Map each celebrity's name (just the name for now) to the Celebrity object.
    // Tip: assert there are 6 celebrities
    @Test
    public void showSixCelebrities(){
        // Arrange - preparamos
        CelebrityGenerator generator = new CelebrityGenerator();
        List<Celebrity> celebrities = generator.getCelebrities();
        // Act- ejecutamos

        // Assert - comprobamos
        Assertions.assertTrue(celebrities.size() ==6);
    }

    @Test
    public void showThreeSingers(){
        // Arrange - preparamos
        CelebrityGenerator generator = new CelebrityGenerator();
        List<Celebrity> celebrities = generator.getCelebrities();
        // Act- ejecutamos

        // Assert - comprobamos
        Assertions.assertEquals(celebrities.stream()
                .filter(celebrity -> celebrity.getProfession().equals("Singer")).toArray().length,3);
    }

    //3. Add country to the Celebrity object.  Tip: assert there are 2 US citizen
    @Test
    public void showTwoAreUsCitizens(){
        // Arrange - preparamos
        CelebrityGenerator generator = new CelebrityGenerator();
        List<Celebrity> celebrities = generator.getCelebrities();
        // Act- ejecutamos

        // Assert - comprobamos
        Assertions.assertEquals(2, celebrities.stream()
                .filter(celebrity -> celebrity.getCountry().equals("US")).toArray().length);
    }

}
