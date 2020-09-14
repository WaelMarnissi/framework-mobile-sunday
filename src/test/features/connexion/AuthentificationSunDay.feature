Feature: SunDay Mobile - Authentification

  En tant que Utilisateur 
  	je souhaite m'authentifier sur l'application SunDay

  @Connexion
  Scenario: SunDay Mobile - Authentification
  
    Given Ouvrir l application SunDay
    When cliquer sur Vous avez deja un compte
    And saisir adresse mail
    And saisir mot de passe
    And cliquer sur Connexion
    Then page Mes familles s affiche
  

