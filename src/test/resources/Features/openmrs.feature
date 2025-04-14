Feature: Open MRS

  Scenario: Login scenario
    Given Open the browser
    Then Enter Username "admin"
    Then Enter password "Admin123"
    Then Select location "Inpatient Ward"
    And Click on login button
    Then the user should be logged in successfully

  Scenario: Capture Vitals
    Given the user is logged in to OpenMRS
    And the user navigates to the "Vitals" section
    When the user enters the following vitals:
      | Arterial blood oxygen saturation (pulse oximeter) | 98 |
    And the user submits the vitals form

    