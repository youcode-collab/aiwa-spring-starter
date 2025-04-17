# AIWA Spring Starter kit

## A propos

AIWA Spring Starter Kit est un template préconstruit pour démarrer rapidement des applications Spring Boot avec les fonctionnalités suivantes :

- Gestion globale des exceptions
- Structure en couches (Controller, Service, Repository)
- Intégration d'IA avec Ollama et OpenAI
- Spring Security pré-configuré
- Support de base de données avec JPA

## Structure du projet

```
src/main/java/com/aiwa/project/
├── ProjectApplication.java       # Point d'entrée de l'application
├── config/                       # Configuration de l'application
│   ├── SecurityConfig.java       # Configuration de la securité dans le project
│   └── GlobalExceptionHandler.java # Configuration des exceptions
├── controller/                   # Contrôleurs REST
│   └── AIController.java        # Exemple de contrôleur API
├── service/                      # Couche service
│   ├── AIService.java            # Interface du service AI
│   └── impl/                     # Implémentations des services
│       └── AIServiceImpl.java    # Implémentation du service AI
├── repository/                   # Couche d'accès aux données
├── model/                        # Entités et modèles
│   ├── entity/                   # Entités JPA
│   └── dto/                      # Objets de transfert de données
├── exception/                    # Défintion des exceptions
└── util/                        # Classes utilitaires
```

## Configuration

Les fichiers de configuration se trouvent dans `src/main/resources/` :
- `application.properties` : Configuration principale des éléments Spring ainsi que pour la partie IA.
- Dans le fichier `pom.xml`, les drivers de base de données sont commentés. Pour les utiliser, il suffit d'enlever les commentaires, de même pour Ollama et OpenAI.

## Démarrage

1. Configurez les clés API dans `application.properties`
2. Lancez l'application : `./mvnw spring-boot:run`

## Utilisation des modèles d'IA

Le starter inclut des exemples pour utiliser à la fois Ollama (local) et OpenAI (cloud).

