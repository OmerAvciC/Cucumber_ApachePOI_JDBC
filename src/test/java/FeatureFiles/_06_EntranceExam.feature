Feature: Entrance Functionality

  Background:

    When Navigate to basqar
    And Enter username and password and click login button
    Then User should login successfuly

  Scenario: Create a Exam, Delete Exam

    And Click on the element in the left nav
      | entrance  |
      | setupOne2 |
      | entrance2 |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | HENRYKISSINGERRRR |

    And Click on the element in the Form Content
      | academicPeriod |
      | getPeriod      |
      | gradeLevel     |
      | gradeLevel2    |

    #TODO: Akademik period ve GradeLevel tıklanma problemi

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And Click on the element in the left nav
      | entrance  |
      | setupOne2 |
      | entrance2 |

    And User delete item from Dialog
      | HENRYKISSINGERRRR |

    Then Success message should be displayed



