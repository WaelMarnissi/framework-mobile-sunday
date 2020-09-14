Feature: SunDay Mobile - Création Compte

  En tant que Utilisateur 
  	je souhaite créer un compte sur l'application SunDay

  @Création
  Scenario: SunDay Mobile - CréationCompte
  
    Given Ouvrir l application SunDay
    When cliquer sur Se connecter
    And cliquer sur S'inscrire
    And saisir le Nom
    And cliquer sur flèche suivant 
    And Cliquer sur Passer
    And saisir l'eamil
    And saisir le mot de passe 
    And Accepter les CGU
    And cliquer sur flèche suivant
    Then page Mes familles s affiche
  

