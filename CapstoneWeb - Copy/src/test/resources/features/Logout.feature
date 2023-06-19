@logout
Feature: logout
  As a Admin
  I want to logout
  So that I can exit from website

  Background:
    Given I am on the landing page
    When I click get into the dashboard button
    And I enter username
    And I enter password
    And I click sign in button
    Then I am on the dashboard

  @SuccessLogout
  Scenario: As a admin i success logout from website
    Given I click icon logout
    Then I redirected to the landing page