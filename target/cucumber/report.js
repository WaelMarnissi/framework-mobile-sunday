$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AuthentificationSunDay.feature");
formatter.feature({
  "line": 1,
  "name": "SunDay Mobile - Authentification",
  "description": "\nEn tant que Utilisateur \n\tje souhaite m\u0027authentifier sur l\u0027application SunDay",
  "id": "sunday-mobile---authentification",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9304671400,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "SunDay Mobile - Authentification",
  "description": "",
  "id": "sunday-mobile---authentification;sunday-mobile---authentification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Connexion"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Ouvrir l application SunDay",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "cliquer sur Vous avez deja un compte",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "saisir adresse mail",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "saisir mot de passe",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "cliquer sur Connexion",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "page Mes familles s affiche",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationSunDayStepDef.ouvrirLApplicationSunDay()"
});
formatter.result({
  "duration": 63156600,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationSunDayStepDef.cliquerSurVousAvezDejaUnCompte()"
});
formatter.result({
  "duration": 2265395900,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationSunDayStepDef.saisirAdresseMail()"
});
formatter.result({
  "duration": 2430484700,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationSunDayStepDef.saisirMotDePasse()"
});
formatter.result({
  "duration": 1558431500,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationSunDayStepDef.cliquerSurConnexion()"
});
formatter.result({
  "duration": 1077212500,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationSunDayStepDef.pageMesFamillesSAffiche()"
});
formatter.result({
  "duration": 24300,
  "status": "passed"
});
formatter.after({
  "duration": 16900,
  "status": "passed"
});
});