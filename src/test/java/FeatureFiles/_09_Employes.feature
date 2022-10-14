Feature: Empoless Functionality

  Background:

    When Navigate to basqar
    And Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Create a employe

    And Click on the element in the left nav
      | humanReso |
      | employess |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Form Content
      | firstname        | <firstname>      |
      | lastname         | <lastname>       |
      | middlename       | <middlename>     |
      | employeeId       | <employeId>      |
      | citizenShip      | <citiShip>       |
      | nationality      | <nationality>    |
      | documentNumber   | <documentNumber> |
      | personalID       | <personalID>     |
      | schoolDepartment | <Department>     |

    And Click on the element in the Form Content
      | gender        |
      | male          |
      | employeType   |
      | otherBTN      |
      | qualification |
      | secondaryTech |
      | documentType  |
      | persID        |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    Examples:
      | firstname | lastname  | middlename | employeId | citiShip | nationality |
      | haydars   | chopengil | heidegger  | 22333333  | 9099090  | faroeisland |




