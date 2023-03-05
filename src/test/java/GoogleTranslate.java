import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTranslate {

    @BeforeTest
    public static void setUp(){
        RestAssured.baseURI="https://google-translate1.p.rapidapi.com/language/translate/v2/";
    }
    @Test
    public void testDetectLanguageStatusCode(){

    }
}
