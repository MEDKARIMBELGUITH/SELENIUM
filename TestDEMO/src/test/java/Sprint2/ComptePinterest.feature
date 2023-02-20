
@tag
Feature: creer compte pinterest 
  creation compte PST

  @tag1
  Scenario: creation compte PST
    Given ouvrir browser
    And ouvrir l url
    And cliquer sur s inscrire
    When entrer e-mail
    And entrer mot de passe 
    And entrer age
    And cliquer sur continuer 
    And cliquer sur suivant 
    And entrer genre
    And entrer langue
    And entrer Pays 
    And selectionner theme
    And cliquer sur termine
    Then compte PST cree
    