Feature: Testing different request on the student application

  Scenario: Check if the student application can be access by users
    When user sends a get request to list endpoint, they must get back a valid status code 200



    Scenario Outline: Create a new student and verify if the student is added
      When I create a new student by providing the information firstName "<firstName>" lastName"<lastName>" email"<email>" programme"<programme>" courses "<courses>"
      Then I verify that the student with "<email>" is created
      Examples:
        | firstName | lastName | email | programme | courses |
        | Prime     | Testing  |prm123@gmail.com|Testing|java|
        | Prime1    |Automation|prm453@gmail.com|Testing|java|
#
#
#





