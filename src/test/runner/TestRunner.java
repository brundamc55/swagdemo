import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


    @RunWith(Cucumber.class)
    @CucumberOptions(
        features = {"src/feature"}, // Specify the path to your feature files
        glue = {"stepdef"}, // Specify the package where your step definitions are located
        plugin = {"pretty"} // Specify the plugins you want to use for reporting
    )
    public class TestRunner {
        // Leave this class empty
    }

