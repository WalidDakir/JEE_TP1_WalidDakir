Ce projet est une démonstration des concepts de base de l'architecture JEE (Java Enterprise Edition), mettant l'accent sur le couplage faible et l'injection de dépendances. Il couvre les étapes suivantes :

Objectifs du projet :
1. Création de l'interface IDao :
L'interface IDao contient une méthode getDate pour récupérer une date.

2. Implémentation de l'interface IDao :
Une implémentation concrète de l'interface IDao est créée pour fournir une fonctionnalité spécifique à la méthode getDate.

3. Création de l'interface IMetier :
L'interface IMetier contient une méthode calcul pour effectuer des calculs ou des traitements métiers spécifiques.

4. Implémentation de l'interface IMetier avec couplage faible :
L'interface IMetier est implémentée en utilisant une approche de couplage faible, ce qui permet de séparer les composants et faciliter leur maintenance et testabilité.

5. Injection des dépendances :
• Injection par instanciation statique : La dépendance est injectée de manière statique.
• Injection par instanciation dynamique : La dépendance est injectée de manière dynamique lors de l'exécution.
• Injection en utilisant le Framework Spring :
     - Version XML : Utilisation de fichiers XML pour configurer l'injection des dépendances dans l'application Spring.
     - Version annotations : Utilisation des annotations Spring (@Autowired, @Component, etc.) pour la gestion des dépendances.

Technologies utilisées :
• Java SE : Pour la logique de base du projet.
• Spring Framework : Pour l'injection de dépendances et la gestion du cycle de vie des objets.
• Spring XML Configuration : Pour la configuration des beans et des dépendances via XML.
• Spring Annotations : Pour une configuration plus moderne avec annotations, réduisant la complexité de la configuration XML.

Fonctionnalités :
• Gestion des dépendances : Le projet illustre l'importance du couplage faible dans le développement logiciel et montre comment injecter des dépendances à la fois de manière statique et dynamique.
• Modularité : Grâce à l'injection de dépendances, chaque composant de l'application est découplé, ce qui rend l'application plus flexible et plus facile à tester.
