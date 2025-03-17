# Calculatrice Java

## Description

Ce projet implémente une **calculatrice simple** en Java capable de réaliser les opérations de base suivantes :

- Addition
- Soustraction
- Multiplication
- Division

Le programme prend en entrée deux nombres et permet à l'utilisateur de choisir l'opération à effectuer. Il gère aussi les exceptions, telles que la division par zéro.

## Fonctionnalités

- **Addition** : Additionne deux nombres.
- **Soustraction** : Soustrait un nombre d'un autre.
- **Multiplication** : Multiplie deux nombres.
- **Division** : Divise un nombre par un autre, avec gestion de la division par zéro.

## Prérequis

- **Java** version 8 ou supérieure.

## Installation

1. **Clonez le dépôt** :
    ```bash
    git clone https://github.com/ton-utilisateur/Calculatrice-Java.git
    ```
2. **Accédez au répertoire du projet** :
    ```bash
    cd Calculatrice-Java
    ```

3. **Compilez le programme** :
    Si vous avez déjà installé Java, compilez le fichier source avec la commande suivante :
    ```bash
    javac Calculatrice.java
    ```

## Utilisation

1. **Exécutez la calculatrice** :
    Après la compilation, exécutez le programme avec :
    ```bash
    java Calculatrice
    ```

2. **Interaction avec l'utilisateur** :
    Le programme vous demandera d'entrer deux nombres, puis de choisir l'opération à effectuer (Addition, Soustraction, Multiplication ou Division).

3. **Résultats** :
    Le programme affichera le résultat de l'opération choisie.

### Exemple d'exécution :
```
Entrez le premier nombre : 5
Entrez le deuxième nombre : 3
Choisissez une opération :
1. Addition
2. Soustraction
3. Multiplication
4. Division
2
Le résultat est : 2.0
```

## Gestion des erreurs

Le programme gère les erreurs suivantes :
- Division par zéro : Le programme affichera un message d'erreur si vous tentez de diviser par zéro.

## Contribution

1. Fork ce dépôt.
2. Crée une branche pour ta fonctionnalité (`git checkout -b feature/nouvelle-fonctionnalité`).
3. Commit tes changements (`git commit -am 'Ajoute une nouvelle fonctionnalité'`).
4. Push ta branche (`git push origin feature/nouvelle-fonctionnalité`).
5. Ouvre une Pull Request.

## License

Ce projet est sous la licence [MIT](https://opensource.org/licenses/MIT).

---

Merci d'utiliser cette calculatrice ! N'hésitez pas à contribuer ou à améliorer le code.
