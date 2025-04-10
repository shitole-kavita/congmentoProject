Feature: Test the Parallel Scenario

  #Test Scenario Parallel in cucumber with TestNG
  Scenario: Test Google Home Page Functionality
    Given user is on google home page
    And validate home page title

  Scenario: Test Facebook Home Page Functionality
    Given user is on facebook home page
    And validate fb home page title

  Scenario: Test Amazon Home Page Functionality
    Given user is on Amazon home page
    And validate Amazon home page title
