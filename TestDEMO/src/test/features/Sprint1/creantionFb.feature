
@TNR1
Feature: creation FB
  on va creer un compte FB 

  @tag1
  Scenario: creation compte FB
    Given ouvrir navigateur
    And ouvrir url
    And cliquer sur creer compte
    When entrer nom
    And entrer prenom
    And entrer mail
    And entrer mail de confirmation
    And entrer password
    And date de naissance
    And selectionner genre
    And cliquer sur inscription 
    
    Then compte FB cree
   

  