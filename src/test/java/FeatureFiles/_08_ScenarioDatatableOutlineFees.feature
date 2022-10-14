#  Daha önceki Create a Fee, delete Fee Senaryosunu
#  Aşağıdaki 5 farklı değerler için çalıştırınız.

Feature: Fees Functionality

  Background:

    When Navigate to basqar
    And Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Create a Fee, delete a fee

    And Click on the element in the left nav
      | setupOne   |
      | parameters |
      | fees       |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | intagrationCode | <intCode>  |
      | priority        | <priority> |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | <name> |

    And Success message should be displayed
    Examples:
      | name           | code | intCode | priority |
      | ERICCANTONA100  | 2122 | yahooo  | 2330     |
      | MUSTAFAKESER100 | 3303 | netlog  | 1120     |



