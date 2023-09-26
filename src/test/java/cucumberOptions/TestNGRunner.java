package cucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\features\\Alert.feature",
glue="stepDefinitions",monochrome = true,publish =true)

public class TestNGRunner {
}
