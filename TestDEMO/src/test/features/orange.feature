
@tag
Feature: authentification orange
  on va faire l authentification du site orange 

  @tag1
  Scenario: authentification valide
    Given ouvrir URL de l application
  
    When saisir login 
    And mot de passe
    And click bouton se connecter
    
    Then page acceuil s ouvre
    

  