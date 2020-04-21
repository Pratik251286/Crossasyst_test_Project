
Feature: Crossasyst Test Scenario
 
Scenario Outline: Order Women Product
Given Launch Chrome and open Automation Website
And Create Account under Sign In with Email Id as "<EmailId>"
And Login with User Credentials as "<EmailId>" and "<Passwd>"
And Select WOMEN product and add two qty for the same
Then Complete Checkout process and verify total cost
Then Verify amount of order under ORDER History
Examples:
|EmailId              |Passwd        |
|pratikA1234@gmail.com|Powerpoint@123|



















