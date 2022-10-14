Feature: DataTable Functionality

  Background:

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Create Country

    And Click on the element in the left nav
      | setupOne   |
      | parameters |
      | Countries  |

    And Click on the element in the Dialog
      | addButton     |


    And User sending the keys in Dialog content
      | nameInput | Sheila |
      | codeInput | 2727   |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | Sheila |

    And Success message should be displayed


  Scenario: Create a Nationality

    And Click on the element in the left nav
      | setupOne    |
      | parameters  |
      | nationality |

    And Click on the element in the Dialog
      | addButton     |

    And User sending the keys in Dialog content
      | nameInput | ASLANKRALl |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | ASLANKRALl |

    And Success message should be displayed

  Scenario: Create a Fee, Delete Fee

    And Click on the element in the left nav
      | setupOne   |
      | parameters |
      | fees       |

    And Click on the element in the Dialog
      | addButton     |

    And User sending the keys in Dialog content
      | nameInput       | GOOOMIIIISS |
      | codeInput       | 2727        |
      | intagrationCode | 535308      |
      | priority        | 1585        |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | GOOOMIIIISS |

    And Success message should be displayed