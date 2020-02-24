# Polycar Studio

Polycar est un langage permettant de définir le comportement d'un véhicule autonome dans un environnement de simulation CoppeliaSim.

## Configuration

Pour ouvrir le projet dans Gemoc Studio :

* Ouvrir un workspace dans le dossier polycar-dsl
* Importer tous les projets avec "Existing Projects into Workspace" :
	* fr.unice.polytech.dsl.polycar
	* fr.unice.polytech.dsl.polycar.edit
	* fr.unice.polytech.dsl.polycar.editor
	* fr.unice.polytech.dsl.polycar.xtext
	* fr.unice.polytech.dsl.polycar.xtext.ide
	* fr.unice.polytech.dsl.polycar.xtext.ui
	* fr.unice.polytech.dsl.polycar.k3
	* fr.unice.polytech.dsl.polycar.design
	* fr.unice.polytech.dsl.polycar.xdsml
* Importer également le projet runtime se trouvant à la racine de ce dépôt git.


## Démarrer le modeling workbench

* Démarrer le simulateur CoppeliaSim
* [Optionnel] Si le simulateur est lancé dans une VM, aller dans le projet k3 et modifier le fichier src/fr.unice.polytech.dsl.polycar.k3/PolycarAspect.xtend pour modifier l'IP de connexion au simulateur
* Créer une configuration de lancement de type Eclipse Application
* Dans l'onglet Arguments, spécifier le VM arguments suivant:
```
-Djava.library.path=<absolute_path_to_repository>/runtime/src/main/resources/vrepLibs/Linux/64Bit
```
* Lancer la configuration pour démarrer le modeling workbench


## Lancer le modèle d'exemple

Une fois le modeling workbench démarré :

* Importer le projet runtime-PolycarStudio situé à la racine de ce dépôt git
* Créer une configuration de lancement de type Executable model with GEMOC Java engine
* Régler le model à executer
* Régler le langage sur fr.unice.polytech.dsl.polycar.Polycar
* Régler la Main method et le main model element path
* Démarrer la configuration !

