$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("account/CreateAccount.feature");
formatter.feature({
  "line": 1,
  "name": "SunDay Mobile - Creation Compte",
  "description": "\nEn tant que Utilisateur \n\tje souhaite créer un compte sur l\u0027application SunDay",
  "id": "sunday-mobile---creation-compte",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20976879100,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "SunDay Mobile - CreationCompte",
  "description": "",
  "id": "sunday-mobile---creation-compte;sunday-mobile---creationcompte",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Creation-compte"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Ouvrir l application SunDay",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "cliquer sur Se connecter",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "cliquer sur S\u0027inscrire",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "saisir le Nom",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "cliquer sur fleche suivant",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Cliquer sur Passer",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "saisir l\u0027eamil",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "saisir le mot de passe",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Accepter les CGU",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "cliquer sur fleche suivant",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "page Mes familles s affiche",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationSunDayStepDef.ouvrirLApplicationSunDay()"
});
formatter.result({
  "duration": 88299400,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.cliquerSurSeConnecter()"
});
formatter.result({
  "duration": 14444304200,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.cliquerSurSInscrire()"
});
formatter.result({
  "duration": 15180191800,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.saisirLeNom()"
});
formatter.result({
  "duration": 45000,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.cliquerSurFlecheSuivant()"
});
formatter.result({
  "duration": 25800,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.cliquerSurPasser()"
});
formatter.result({
  "duration": 20300,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.saisirLEamil()"
});
formatter.result({
  "duration": 18800,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.saisirLeMotDePasse()"
});
formatter.result({
  "duration": 23200,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.accepterLesCGU()"
});
formatter.result({
  "duration": 11700,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.cliquerSurFlecheSuivant()"
});
formatter.result({
  "duration": 8600,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationSunDayStepDef.pageMesFamillesSAffiche()"
});
formatter.result({
  "duration": 79800,
  "status": "passed"
});
formatter.after({
  "duration": 13400,
  "status": "passed"
});
});