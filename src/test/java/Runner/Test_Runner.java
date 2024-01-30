package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\Vigneshsubramaniyan\\Desktop\\AutoBot\\src\\test\\resources\\Features\\Login.feature",glue={"Step_defFB"},
        tags = "@1",plugin = {"pretty","junit:target/Cucu.xml","html:target/Cucu.html"})



public class Test_Runner {


/*
POM file -  Project Object Model

POM - Page Object Model






*/


}
