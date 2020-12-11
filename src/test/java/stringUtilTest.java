import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class stringUtilTest {

    private stringUtil stringutil;

    @BeforeAll
    public void setup(){

        stringutil = new stringUtil();
    }

    //revert string
    @Test
    public void reverseStringmustConvertSebastianToNaitsabes() {
        //Arrange
        var expected = "naitsabes";
        //Act
        var result = stringutil.reverseString("sebastian");
        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void reverseStringmustConvertLiverpoolTolooprevil() {
        //Arrange
        var expected = "looprevil";
        //Act
        var result = stringutil.reverseString("liverpool");
        //Assert
        assertEquals(expected, result);

    }


    //capitalize


    @Test
    public void capitalizeStringStringmustConvertLiverPOOLToLIVERPOOL() {
        //Arrange
        var expected = "LIVERPOOL";
        //Act
        var result = stringutil.toCapitalize("liverPOOL");
        //Assert
        assertEquals(expected, result);


    }


    @Test
    public void capitalizeStringStringmustConvertLIVERpoolToLIVERPOOL() {
        //Arrange
        var expected = "LIVERPOOL";
        //Act
        var result = stringutil.toCapitalize("LIVERpool");
        //Assert
        assertEquals(expected, result);

    }

    //tolowercase


    @Test
    public void toLovercasemustConvertLiVeRpOoLToliverpool() {
        //Arrange
        var expected = "liverpool";
        //Act
        var result = stringutil.toLowerCase("LiVeRpOoL");
        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void toLovercasemustConvertSEBASTIANTosebastian() {
        //Arrange
        var expected = "sebastian";
        //Act
        var result = stringutil.toLowerCase("SEBASTIAN");
        //Assert
        assertEquals(expected, result);

    }

}
