@grid
Feature: title_test

  @chrome
  Scenario: TC01_title_test_chrome
    Given user is on the homepage "https://www.managementonschools.com/"
    Then verify title is "Managementon Schools"
    And close the remote driver

  @edge
  Scenario: TC02_title_test_edge
    Given user is on the homepage "https://www.managementonschools.com/" by edge
    Then verify title is "Managementon Schools"
    And close the remote driver


  @firefox
  Scenario: TC02_title_test_edge
    Given user is on the homepage "https://www.managementonschools.com/" by firefox
    Then verify title is "Managementon Schools"
    And close the remote driver