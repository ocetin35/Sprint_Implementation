package com.V_Track_Project.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber" //generates Maven cucumber reporting
        },
        features = "src/test/resources/features",
        glue = "com/V_Track_Project/step_definitions",
        dryRun = false,
        tags = "",
        publish = true //generating a report with public link
        // , monochrome = true (consoledeki renk deistiriyo onemli bisi degil)

)
public class Runner {
}
