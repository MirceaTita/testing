  Feature: Check the buttons
  Scenario: Check the buttons from qa-practice
  Given Open the browser
    When Access page "https://qa-practice.netlify.app/"
    And Press button "Forms1"
    And Press button "Login"
    And Complete field "Email" with value "admin@admin.com"
    And Complete field "Password" with value "admin123"
    And Press button "Submit"
   