Feature: Functionality of DemoQA website

#@ElementTextBox
#Scenario: Checking textbox functionality 
#Given open the url 
#When click on the elements tab 
#Then fetch all the option in the elements tab 
#And click on the text box option
#Then Display the all the text box available in the text box page
#Then enter the all the fields "<name>" "<email>" "<currentaddress>" "<permanentaddress>"
#Then verify all the details "<name>" "<email>" "<currentaddress>" "<permanentaddress>"
#
#Examples:
#|name|email|currentaddress|permanentaddress|
#|Naveen|naveenbhogam8722@gmail.com|ilkal|ilkal|
#
#@ElementCheckbox
#Scenario: Checking checkbox functionality 
#Given open the url 
#When click on the elements tab 
#Then fetch all the option in the elements tab 
#Then click on the check box option
#And verify chekcbox unselected
#Then Verify all the checkboxes unselected
#And select the checkbox
#Then verify all the checkboxes selected
#Then verify text msg showned below
#And diselect the parent checkbox and verify the text msg
#And select only one child checkbox and verify parent check box partially selected
#Then verify text msg showned below contains selected child and parent checkbox name
#Then select all the child checkbox and verify parent chekc box fully selected
#Then verify text msg showned below contains selected child and parent checkbox name
#Then diselect only one child check box and verify parent check box got updated as partially selected
#Then verify text msg showned below that updated to only selected checkboxes
#And diselect all the child checkbox and verify parent check box is unselected
#Then verify arrow point working functionality 
#Then verify plus and minus working functionality
#
#@ElementRadio
#Scenario: Checking checkbox functionality 
#Given open the url 
#When click on the elements tab 
#Then fetch all the option in the elements tab 
#Then click on the radio option
#Then varify the text displayed
#Then varify the yes, impressive and no radio buttons are displayed
#Then varify yes and impressive radio buttons are enabled for check or uncheck
#Then varify the no radio button is disabled
#Then click the yes button and varify the text msg 
#Then click the impessive radio button and varify the text msg

#@ElementWebElementAdd
#Scenario: Add into the webtable
#Given open the url 
#When click on the elements tab 
#Then fetch all the option in the elements tab 
#Then click on the WebTable option
#Then Verify the add button and click on that button 
#Then Fetch input fields and verify "<firstname>" "<lastname>" "<mail>" "<age>" "<salary>" "<department>"
#Then enter the inputs "<fname>" "<lname>" "<email>" "<ageint>" "<salaryint>" "<dept>"
#Then Click on the submit button

#Examples:
#|firstname|lastname|mail|age|salary|department|fname|lname|email|ageint|salaryint|dept|
#|First Name|Last Name|Email|Age|Salary|Department|Naveen|Bogum|naveen@gmail.com|24|32000|mech|

#@ElementWebTableVerifyAddeddetails
#Scenario: Add into the webtable
#Given open the url 
#When click on the elements tab 
#Then fetch all the option in the elements tab 
#Then click on the WebTable option
#Then Verify the add button and click on that button 
#Then enter the inputs "<fname>" "<lname>" "<email>" "<ageint>" "<salaryint>" "<dept>"
#Then Click on the submit button
#Then verify the detials in the table "<fname>" "<lname>" "<email>" "<ageint>" "<salaryint>" "<dept>"
#Examples:
#|fname|lname|email|ageint|salaryint|dept|
#|Naveen|Bogum|naveen@gmail.com|24|32000|mech|

#
#@ElementWebTableVerifyAddeddetailswithSearch
#Scenario: Add into the webtable
#Given open the url 
#When click on the elements tab 
#Then fetch all the option in the elements tab 
#Then click on the WebTable option
#Then Verify the add button and click on that button 
#Then enter the inputs "<fname>" "<lname>" "<email>" "<ageint>" "<salaryint>" "<dept>"
#Then Click on the submit button
#Then search on with firsnamt "<lname>"
#Then verify the detials in the table after searching "<fname>" "<lname>" "<email>" "<ageint>" "<salaryint>" "<dept>"
#Examples:
#|fname|lname|email|ageint|salaryint|dept|
#|Naveen|Bogum|naveen@gmail.com|24|32000|mech|
#
#
#@ElementWebTableVerifyerrormsg
#Scenario: Add into the webtable
#Given open the url 
#When click on the elements tab 
#Then fetch all the option in the elements tab 
#Then click on the WebTable option
#Then Verify the add button and click on that button 
#Then Click on the submit button
#Then verify the error msg "<errormsg>"
#Then enter the inputs "<fname>" "<lname>" "<email>" "<ageint>" "<salaryint>" "<dept>"
#Then Click on the submit button
#Then verify the error msg for format "<errormsgforformat>"
#
#
#Examples:
#|errormsg|errormsgforformat||fname|lname|email|ageint|salaryint|dept|
#|Please fill out this field.|Please match the requested format.||Naveen|Bogum|naveengmail.com|xsd|dfsd|mech|


@ElementButtons
Scenario: buttons functionality
Given open the url 
When click on the elements tab 
Then fetch all the option in the elements tab 
Then click on the buttons option
Then varify the all the buttons are displayed
Then varify the msg displayed below "<doubleclick>" "<rightclick>" "<click>"

Examples:
|doubleclick|rightclick|click|
|You have done a double click|You have done a right click|You have done a dynamic click|

@ElementsLinks
Scenarion: newtab functionality
Given open the url 
When click on the elements tab 
Then fetch all the option in the elements tab 
Then click on the links option
Then fetch all the links available on the page
Then click on the home link and verify its new tab 
Then click on the another link and verify its new tab






