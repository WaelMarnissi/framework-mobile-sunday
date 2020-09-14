Feature: SunDay Mobile - Creation Compte
  
  En tant que Utilisateur 
  	je souhaite créer un compte sur l'application SunDay

  @Creation-compte
  Scenario: SunDay Mobile - CreationCompte
    Given Ouvrir l application SunDay
    When cliquer sur Se connecter
    And cliquer sur S'inscrire
    And saisir le Nom
    And cliquer sur fleche suivant
    And Cliquer sur Passer
    And saisir l'eamil
    And saisir le mot de passe
    And Accepter les CGU
    And cliquer sur fleche suivant
    Then page Mes familles s affiche
