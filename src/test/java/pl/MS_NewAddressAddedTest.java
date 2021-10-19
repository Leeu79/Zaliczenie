package pl;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\CL\\ONL_TEA_W_04_Dzien_6_-_Cucumber_Framework\\src\\test\\resources\\features\\", plugin = {"pretty", "html:out.html"}, tags = "@NewAddress or @BuySweter")
public class MS_NewAddressAddedTest {
}

