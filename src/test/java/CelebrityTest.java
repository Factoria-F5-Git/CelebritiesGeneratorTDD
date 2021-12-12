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
}
