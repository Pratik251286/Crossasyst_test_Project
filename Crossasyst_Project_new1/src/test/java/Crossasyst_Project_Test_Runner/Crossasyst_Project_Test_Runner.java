package Crossasyst_Project_Test_Runner;

import java.io.*;

import org.junit.AfterClass;

import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;


 
@RunWith(Cucumber.class)
@CucumberOptions(

              monochrome = true,
             
              plugin= {"pretty","html:target/cucumber-html report","json:target/cucumber-report.json"},
              //plugin = {"pretty", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/WOPT_Regression_Test_LAB_report_060420_V2_16_15.html"},
              features = {"src/test/resources/Features"},
              glue = {"Crossasyst_Project_Step_Def"}
              //tags= {"@Tag1"}
              )

 public class Crossasyst_Project_Test_Runner {
	

}
