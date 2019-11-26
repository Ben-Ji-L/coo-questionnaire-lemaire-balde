# COO Courriers

- Lemaire Benjamin
- Balde Ibrahima

## Nature du projet

Il s'agit de la modélisation d'un questionnaire, d'abord dans un terminale puis avec une interface graphique.

## Instructions d'installation

Après avoir télécharger le projet sur gitlab placez vous à la racine du projet et lancez la commande :

`mvn package`

cette commande compile le projet, lance les tests et génère la documentation du projet (à l’aide de l’outil javacdoc).

##Lancement du programme

Le jar produit par **mvn package** se trouve dans le dossier. `target/` et s'appelle **questionnaire-1.0-SNAPSHOT.jar**, pour l'exécuter depuis la racine du projet
il faut lancer la commande : 
`java -jar target/questionnaire-1.0-SNAPSHOT.jar`


## Documentation

La Javadoc se trouve dans le dossier `target/apidocs/` au format HTML.

## Tests unitaires

Les tests du projet nécessitent JUnit 4 pour fonctionner, ils se trouvent dans le répertoire `src/main/test/` 
