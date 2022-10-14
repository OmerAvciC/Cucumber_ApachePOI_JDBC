#  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption      | GradeLevelOption |
#| Math exam is1   | academicPeriod2              | gradeLevel4  |
#| IT exam is1     | academicPeriod2              | gradeLevel2  |
#| Oracle exam is1 | academicPeriod2              | gradeLevel3  |
#| Math exam  is1  | academicPeriod2              | gradeLevel1  |

Feature: Entrance Functionality

  Background:

    When Navigate to basqar
    And Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Create a Exam, Delete Exam

    And Click on the element in the left nav
      | entrance  |
      | setupOne2 |
      | entrance2 |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | <ExamName> |

    And Click on the element in the Form Content
      | academicPeriod         |
      | <AcademicPeriodOption> |
      | gradeLevel             |
      | <GradeLevelOption>     |

    #TODO: Akademik period ve GradeLevel tıklanma problemi

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And Click on the element in the left nav
      | entrance  |
      | setupOne2 |
      | entrance2 |

    And User delete item from Dialog
      | <ExamName> |

    Then Success message should be displayed
    Examples:
      | ExamName             | AcademicPeriodOption | GradeLevelOption |
      | BONJOVI100           | getPeriod            | gradeLevel2      |
      | SELAHATTINOZDEMIR100 | getPeriod2           | gradeLevel3      |
      | KIBARIYE10           | getPeriod            | gradeLevel2      |
      | HUGHMASEKELA10       | getPeriod2           | gradeLevel3      |
