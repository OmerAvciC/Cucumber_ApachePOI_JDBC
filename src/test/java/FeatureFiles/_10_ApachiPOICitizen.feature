
  Feature: ApachePOI Citizen Functionality

    Background:
      Given Navigate to basqar
      When Enter username and password and click login button
      Then User should login successfuly
      And Navigate to Citizenship page

      Scenario: Create Citizen from Excel
        When User Create Citizenship with ApachePOI

    Scenario: Delete Citizen from Excel
        When User Delete Citizenship with ApachePOI


