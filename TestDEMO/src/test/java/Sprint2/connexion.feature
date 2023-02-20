@tag
Feature: connexion
  I want to use this template for my feature file

  @tag2
  Scenario Outline: connexionTest
    Given ouvrir driver
    And ouvrir application
    When saisir mail<mail>
    And saisir mot de passes<MDP>
    And click bouton
    Then connecte

    Examples: 
      | mail   | MDP       |
      | Admin  | admin123  |
      | Admin0 | 123456*   |
      | Admin  | admin1234 |
      | Admin0 | admin123  |
