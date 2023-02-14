# selenium-cucumber-junit
Test Automation project using Selenium (Java), Cucumber and JUnit4.

##  Create new Maven Project (Eclipse)
- Check “Create a simple project (skip archetype selection)”
- Group Id: com.trigger_soft
- Artefact Id: selenium-cucumber-junit
- Click “Finish”

## Add maven dependencies
Add maven dependencies (Selenium, Cucumber, JUnit, etc.).

## Convert to Cucumber Project
- Install **Cucumber Eclipse Plugin** from the Eclipse Marketplace.
- Right click on Project – Configure - Convert to Cucumber Project.

## Add JUnit Cucumber Runner Class
- This class's name should end with **Test.java** (Mandatory if we execute tests via mvn commands).

```
// RunCucumberTest.java Class

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports/results.html" }, monochrome = true)
public class RunCucumberTest {
}
```
