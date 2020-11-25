Feature: Validate Orange hrm
@loginwithsingledata
Scenario: verify Login Test
Given user launches browser
When user enter username and password
When user clicks on login button
Then user verify url
Then user close browser
@loginwithmultipledata
Scenario Outline: login with multiple data
Given i launch url in "<Browser>" 
When i enter "<Username>" in username textbox
When i enter "<Password>" in password textbox
When i click login button
Then i verify url 
Then i close browser
Examples:
|Browser|Username|Password|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|
|chrome|Admin1|Qedge123!@#|
|firefox|Admin|Qedge123!@#56|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|
|chrome|Admin5|Qedge123!@#5|
|firefox|Admin|Qedge123!@#|
